package com.mk.ots.roomsale.controller;

import com.alibaba.fastjson.JSONObject;
import com.mk.ots.common.bean.ParamBaseBean;
import com.mk.ots.common.utils.DateUtils;
import com.mk.ots.roomsale.model.TRoomSaleConfigInfo;
import com.mk.ots.roomsale.service.RoomSaleConfigInfoService;
import com.mk.ots.web.ServiceOutput;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.util.*;

/**
 *
 * 特价类型接口
 */
@Controller
public class HotelPromoController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoomSaleConfigInfoService roomSaleConfigInfoService;

	/**
	 * 活动查询
     **/

    @RequestMapping(value = "/promo/querytypelist", method = RequestMethod.POST)
	@ResponseBody
    public ResponseEntity<Map<String, Object>> querytypelist(ParamBaseBean pbb,String cityid,String saletypeid,Integer page,Integer limit) {
    	logger.info("HotelPromoController::querytypelist::params{}  begin", pbb+","+saletypeid+","+cityid+","+page+","+limit);
    	Map<String, Object> result = new HashMap<String, Object>();
    	try {

	    	if (page == null || StringUtils.isBlank(page.toString())) {
	    		page = 1;
	    	}
	    	if (limit == null || StringUtils.isBlank(limit.toString())) {
				limit = 10;
	    	}

	    	
	 	    int start = (page - 1) * limit;


            if (StringUtils.isEmpty(saletypeid)){
                result.put(ServiceOutput.STR_MSG_SUCCESS, false);
                result.put(ServiceOutput.STR_MSG_ERRCODE, "404");
                result.put(ServiceOutput.STR_MSG_ERRMSG, "没有活动");
                return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);
            }

	 	    List<TRoomSaleConfigInfo> roomSaleConfigInfoList= roomSaleConfigInfoService.queryListBySaleTypeId(cityid,Integer.parseInt(saletypeid),start,limit);

            List<JSONObject> list  = new ArrayList<JSONObject>();
            if(CollectionUtils.isNotEmpty(roomSaleConfigInfoList)) {
                for(TRoomSaleConfigInfo saleConfigInfo:roomSaleConfigInfoList){
                    long sec=calDiffTime(saleConfigInfo.getStartDate(), saleConfigInfo.getEndDate(),saleConfigInfo.getStartTime());
                    if (sec<0){
                        continue;
                    }
                    JSONObject ptype1 = new JSONObject();
                    ptype1.put("promotypeid", saleConfigInfo.getId());
                    ptype1.put("promotypetext", saleConfigInfo.getSaleLabel());
                    ptype1.put("promotypeprice", saleConfigInfo.getSaleValue());
                    ptype1.put("promosec", sec/1000);          //秒
                    list.add(ptype1);
                }
            }

			result.put("promotypes", list);

	    	result.put(ServiceOutput.STR_MSG_SUCCESS, true);
    	}catch (Exception e) {
			e.printStackTrace();
			logger.error("HotelPromoController::querytypelist::error{}",e.getMessage());
			result.put(ServiceOutput.STR_MSG_SUCCESS, false);
			result.put(ServiceOutput.STR_MSG_ERRCODE, "-1");
			result.put(ServiceOutput.STR_MSG_ERRMSG, e.getMessage());
		} finally {
			logger.info("HotelCollectionController::querylist::end");
		}
		return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);
    }

    /**
     * seconds
     * @param startDate
     * @param endDate
     * @param startTime
     * @return
     */
    private long calDiffTime(Date startDate,Date endDate, Time startTime) {
        Calendar cal=Calendar.getInstance();
        java.util.Date sysTime = cal.getTime();

        if (DateUtils.addDays(endDate,1).before(sysTime)){
            return -1;  //活动已结束
        } else if (startDate.after(sysTime)){    //活動未開始
            cal.setTime(startDate);
            return timeDiff(startTime, cal, sysTime);
        }else if (DateUtils.addDays(endDate,1).after(sysTime)&&startDate.before(sysTime)){
            cal.setTime(sysTime);
            return timeDiff(startTime, cal, sysTime);
        }
        return 0;
    }

    private long timeDiff(Time startTime, Calendar cal, java.util.Date sysTime) {
        getCalTime(startTime, cal);
        long diff= DateUtils.getDiffTime(DateUtils.formatDatetime(sysTime), DateUtils.formatDatetime(cal.getTime()));
        //活動開始     diff  =0
        if (diff<0){
            diff=0;
        }
        return diff;
    }

    private void getCalTime(Time startTime, Calendar cal) {
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(startTime);
        int hour= cal.get(Calendar.HOUR_OF_DAY);
        int min= cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        cal.set(year,month,day,hour,min,sec);
    }

}
