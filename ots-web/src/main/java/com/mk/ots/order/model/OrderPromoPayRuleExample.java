package com.mk.ots.order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderPromoPayRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderPromoPayRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPromoTypeIsNull() {
            addCriterion("promo_type is null");
            return (Criteria) this;
        }

        public Criteria andPromoTypeIsNotNull() {
            addCriterion("promo_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromoTypeEqualTo(Integer value) {
            addCriterion("promo_type =", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeNotEqualTo(Integer value) {
            addCriterion("promo_type <>", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeGreaterThan(Integer value) {
            addCriterion("promo_type >", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promo_type >=", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeLessThan(Integer value) {
            addCriterion("promo_type <", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("promo_type <=", value, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeIn(List<Integer> values) {
            addCriterion("promo_type in", values, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeNotIn(List<Integer> values) {
            addCriterion("promo_type not in", values, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeBetween(Integer value1, Integer value2) {
            addCriterion("promo_type between", value1, value2, "promoType");
            return (Criteria) this;
        }

        public Criteria andPromoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("promo_type not between", value1, value2, "promoType");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayIsNull() {
            addCriterion("is_ticket_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayIsNotNull() {
            addCriterion("is_ticket_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayEqualTo(Integer value) {
            addCriterion("is_ticket_pay =", value, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayNotEqualTo(Integer value) {
            addCriterion("is_ticket_pay <>", value, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayGreaterThan(Integer value) {
            addCriterion("is_ticket_pay >", value, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_ticket_pay >=", value, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayLessThan(Integer value) {
            addCriterion("is_ticket_pay <", value, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayLessThanOrEqualTo(Integer value) {
            addCriterion("is_ticket_pay <=", value, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayIn(List<Integer> values) {
            addCriterion("is_ticket_pay in", values, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayNotIn(List<Integer> values) {
            addCriterion("is_ticket_pay not in", values, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayBetween(Integer value1, Integer value2) {
            addCriterion("is_ticket_pay between", value1, value2, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsTicketPayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_ticket_pay not between", value1, value2, "isTicketPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayIsNull() {
            addCriterion("is_wallet_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayIsNotNull() {
            addCriterion("is_wallet_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayEqualTo(Integer value) {
            addCriterion("is_wallet_pay =", value, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayNotEqualTo(Integer value) {
            addCriterion("is_wallet_pay <>", value, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayGreaterThan(Integer value) {
            addCriterion("is_wallet_pay >", value, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_wallet_pay >=", value, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayLessThan(Integer value) {
            addCriterion("is_wallet_pay <", value, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayLessThanOrEqualTo(Integer value) {
            addCriterion("is_wallet_pay <=", value, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayIn(List<Integer> values) {
            addCriterion("is_wallet_pay in", values, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayNotIn(List<Integer> values) {
            addCriterion("is_wallet_pay not in", values, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayBetween(Integer value1, Integer value2) {
            addCriterion("is_wallet_pay between", value1, value2, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsWalletPayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_wallet_pay not between", value1, value2, "isWalletPay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayIsNull() {
            addCriterion("is_online_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayIsNotNull() {
            addCriterion("is_online_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayEqualTo(Integer value) {
            addCriterion("is_online_pay =", value, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayNotEqualTo(Integer value) {
            addCriterion("is_online_pay <>", value, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayGreaterThan(Integer value) {
            addCriterion("is_online_pay >", value, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_online_pay >=", value, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayLessThan(Integer value) {
            addCriterion("is_online_pay <", value, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayLessThanOrEqualTo(Integer value) {
            addCriterion("is_online_pay <=", value, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayIn(List<Integer> values) {
            addCriterion("is_online_pay in", values, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayNotIn(List<Integer> values) {
            addCriterion("is_online_pay not in", values, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayBetween(Integer value1, Integer value2) {
            addCriterion("is_online_pay between", value1, value2, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinePayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_online_pay not between", value1, value2, "isOnlinePay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayIsNull() {
            addCriterion("is_real_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsRealPayIsNotNull() {
            addCriterion("is_real_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealPayEqualTo(Integer value) {
            addCriterion("is_real_pay =", value, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayNotEqualTo(Integer value) {
            addCriterion("is_real_pay <>", value, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayGreaterThan(Integer value) {
            addCriterion("is_real_pay >", value, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_real_pay >=", value, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayLessThan(Integer value) {
            addCriterion("is_real_pay <", value, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayLessThanOrEqualTo(Integer value) {
            addCriterion("is_real_pay <=", value, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayIn(List<Integer> values) {
            addCriterion("is_real_pay in", values, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayNotIn(List<Integer> values) {
            addCriterion("is_real_pay not in", values, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayBetween(Integer value1, Integer value2) {
            addCriterion("is_real_pay between", value1, value2, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andIsRealPayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_real_pay not between", value1, value2, "isRealPay");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}