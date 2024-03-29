package com.example.demo.model.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public MUserExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
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
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserNmIsNull() {
            addCriterion("user_nm is null");
            return (Criteria) this;
        }

        public Criteria andUserNmIsNotNull() {
            addCriterion("user_nm is not null");
            return (Criteria) this;
        }

        public Criteria andUserNmEqualTo(String value) {
            addCriterion("user_nm =", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotEqualTo(String value) {
            addCriterion("user_nm <>", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmGreaterThan(String value) {
            addCriterion("user_nm >", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmGreaterThanOrEqualTo(String value) {
            addCriterion("user_nm >=", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLessThan(String value) {
            addCriterion("user_nm <", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLessThanOrEqualTo(String value) {
            addCriterion("user_nm <=", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLike(String value) {
            addCriterion("user_nm like", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotLike(String value) {
            addCriterion("user_nm not like", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmIn(List<String> values) {
            addCriterion("user_nm in", values, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotIn(List<String> values) {
            addCriterion("user_nm not in", values, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmBetween(String value1, String value2) {
            addCriterion("user_nm between", value1, value2, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotBetween(String value1, String value2) {
            addCriterion("user_nm not between", value1, value2, "userNm");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationIsNull() {
            addCriterion("account_expiration is null");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationIsNotNull() {
            addCriterion("account_expiration is not null");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationEqualTo(Date value) {
            addCriterionForJDBCDate("account_expiration =", value, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationNotEqualTo(Date value) {
            addCriterionForJDBCDate("account_expiration <>", value, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationGreaterThan(Date value) {
            addCriterionForJDBCDate("account_expiration >", value, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_expiration >=", value, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationLessThan(Date value) {
            addCriterionForJDBCDate("account_expiration <", value, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_expiration <=", value, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationIn(List<Date> values) {
            addCriterionForJDBCDate("account_expiration in", values, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationNotIn(List<Date> values) {
            addCriterionForJDBCDate("account_expiration not in", values, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_expiration between", value1, value2, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andAccountExpirationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_expiration not between", value1, value2, "accountExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationIsNull() {
            addCriterion("password_expiration is null");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationIsNotNull() {
            addCriterion("password_expiration is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationEqualTo(Date value) {
            addCriterionForJDBCDate("password_expiration =", value, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationNotEqualTo(Date value) {
            addCriterionForJDBCDate("password_expiration <>", value, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationGreaterThan(Date value) {
            addCriterionForJDBCDate("password_expiration >", value, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("password_expiration >=", value, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationLessThan(Date value) {
            addCriterionForJDBCDate("password_expiration <", value, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("password_expiration <=", value, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationIn(List<Date> values) {
            addCriterionForJDBCDate("password_expiration in", values, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationNotIn(List<Date> values) {
            addCriterionForJDBCDate("password_expiration not in", values, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("password_expiration between", value1, value2, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andPasswordExpirationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("password_expiration not between", value1, value2, "passwordExpiration");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
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
     * This class corresponds to the database table public.m_user
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 23 19:52:51 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
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