package com.example.demo.model.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TApiRoleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public TApiRoleExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andApiCdIsNull() {
            addCriterion("api_cd is null");
            return (Criteria) this;
        }

        public Criteria andApiCdIsNotNull() {
            addCriterion("api_cd is not null");
            return (Criteria) this;
        }

        public Criteria andApiCdEqualTo(String value) {
            addCriterion("api_cd =", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdNotEqualTo(String value) {
            addCriterion("api_cd <>", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdGreaterThan(String value) {
            addCriterion("api_cd >", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdGreaterThanOrEqualTo(String value) {
            addCriterion("api_cd >=", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdLessThan(String value) {
            addCriterion("api_cd <", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdLessThanOrEqualTo(String value) {
            addCriterion("api_cd <=", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdLike(String value) {
            addCriterion("api_cd like", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdNotLike(String value) {
            addCriterion("api_cd not like", value, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdIn(List<String> values) {
            addCriterion("api_cd in", values, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdNotIn(List<String> values) {
            addCriterion("api_cd not in", values, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdBetween(String value1, String value2) {
            addCriterion("api_cd between", value1, value2, "apiCd");
            return (Criteria) this;
        }

        public Criteria andApiCdNotBetween(String value1, String value2) {
            addCriterion("api_cd not between", value1, value2, "apiCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdIsNull() {
            addCriterion("role_cd is null");
            return (Criteria) this;
        }

        public Criteria andRoleCdIsNotNull() {
            addCriterion("role_cd is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCdEqualTo(String value) {
            addCriterion("role_cd =", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdNotEqualTo(String value) {
            addCriterion("role_cd <>", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdGreaterThan(String value) {
            addCriterion("role_cd >", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdGreaterThanOrEqualTo(String value) {
            addCriterion("role_cd >=", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdLessThan(String value) {
            addCriterion("role_cd <", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdLessThanOrEqualTo(String value) {
            addCriterion("role_cd <=", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdLike(String value) {
            addCriterion("role_cd like", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdNotLike(String value) {
            addCriterion("role_cd not like", value, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdIn(List<String> values) {
            addCriterion("role_cd in", values, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdNotIn(List<String> values) {
            addCriterion("role_cd not in", values, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdBetween(String value1, String value2) {
            addCriterion("role_cd between", value1, value2, "roleCd");
            return (Criteria) this;
        }

        public Criteria andRoleCdNotBetween(String value1, String value2) {
            addCriterion("role_cd not between", value1, value2, "roleCd");
            return (Criteria) this;
        }

        public Criteria andUpdateCntIsNull() {
            addCriterion("update_cnt is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCntIsNotNull() {
            addCriterion("update_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCntEqualTo(Integer value) {
            addCriterion("update_cnt =", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntNotEqualTo(Integer value) {
            addCriterion("update_cnt <>", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntGreaterThan(Integer value) {
            addCriterion("update_cnt >", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_cnt >=", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntLessThan(Integer value) {
            addCriterion("update_cnt <", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntLessThanOrEqualTo(Integer value) {
            addCriterion("update_cnt <=", value, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntIn(List<Integer> values) {
            addCriterion("update_cnt in", values, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntNotIn(List<Integer> values) {
            addCriterion("update_cnt not in", values, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntBetween(Integer value1, Integer value2) {
            addCriterion("update_cnt between", value1, value2, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andUpdateCntNotBetween(Integer value1, Integer value2) {
            addCriterion("update_cnt not between", value1, value2, "updateCnt");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNull() {
            addCriterion("insert_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNotNull() {
            addCriterion("insert_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdEqualTo(String value) {
            addCriterion("insert_user_id =", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotEqualTo(String value) {
            addCriterion("insert_user_id <>", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThan(String value) {
            addCriterion("insert_user_id >", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("insert_user_id >=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThan(String value) {
            addCriterion("insert_user_id <", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThanOrEqualTo(String value) {
            addCriterion("insert_user_id <=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLike(String value) {
            addCriterion("insert_user_id like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotLike(String value) {
            addCriterion("insert_user_id not like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIn(List<String> values) {
            addCriterion("insert_user_id in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotIn(List<String> values) {
            addCriterion("insert_user_id not in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdBetween(String value1, String value2) {
            addCriterion("insert_user_id between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotBetween(String value1, String value2) {
            addCriterion("insert_user_id not between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampIsNull() {
            addCriterion("insert_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampIsNotNull() {
            addCriterion("insert_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampEqualTo(Date value) {
            addCriterion("insert_timestamp =", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampNotEqualTo(Date value) {
            addCriterion("insert_timestamp <>", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampGreaterThan(Date value) {
            addCriterion("insert_timestamp >", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_timestamp >=", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampLessThan(Date value) {
            addCriterion("insert_timestamp <", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampLessThanOrEqualTo(Date value) {
            addCriterion("insert_timestamp <=", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampIn(List<Date> values) {
            addCriterion("insert_timestamp in", values, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampNotIn(List<Date> values) {
            addCriterion("insert_timestamp not in", values, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampBetween(Date value1, Date value2) {
            addCriterion("insert_timestamp between", value1, value2, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampNotBetween(Date value1, Date value2) {
            addCriterion("insert_timestamp not between", value1, value2, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("update_user_id like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("update_user_id not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNull() {
            addCriterion("update_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNotNull() {
            addCriterion("update_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampEqualTo(Date value) {
            addCriterion("update_timestamp =", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotEqualTo(Date value) {
            addCriterion("update_timestamp <>", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThan(Date value) {
            addCriterion("update_timestamp >", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("update_timestamp >=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThan(Date value) {
            addCriterion("update_timestamp <", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("update_timestamp <=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIn(List<Date> values) {
            addCriterion("update_timestamp in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotIn(List<Date> values) {
            addCriterion("update_timestamp not in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampBetween(Date value1, Date value2) {
            addCriterion("update_timestamp between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("update_timestamp not between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.t_api_role
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 08 20:36:33 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
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