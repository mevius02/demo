package com.example.demo.model.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MGendarExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public MGendarExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
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
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
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

        public Criteria andGendarCdIsNull() {
            addCriterion("gendar_cd is null");
            return (Criteria) this;
        }

        public Criteria andGendarCdIsNotNull() {
            addCriterion("gendar_cd is not null");
            return (Criteria) this;
        }

        public Criteria andGendarCdEqualTo(String value) {
            addCriterion("gendar_cd =", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdNotEqualTo(String value) {
            addCriterion("gendar_cd <>", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdGreaterThan(String value) {
            addCriterion("gendar_cd >", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdGreaterThanOrEqualTo(String value) {
            addCriterion("gendar_cd >=", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdLessThan(String value) {
            addCriterion("gendar_cd <", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdLessThanOrEqualTo(String value) {
            addCriterion("gendar_cd <=", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdLike(String value) {
            addCriterion("gendar_cd like", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdNotLike(String value) {
            addCriterion("gendar_cd not like", value, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdIn(List<String> values) {
            addCriterion("gendar_cd in", values, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdNotIn(List<String> values) {
            addCriterion("gendar_cd not in", values, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdBetween(String value1, String value2) {
            addCriterion("gendar_cd between", value1, value2, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andGendarCdNotBetween(String value1, String value2) {
            addCriterion("gendar_cd not between", value1, value2, "gendarCd");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andGendarNmIsNull() {
            addCriterion("gendar_nm is null");
            return (Criteria) this;
        }

        public Criteria andGendarNmIsNotNull() {
            addCriterion("gendar_nm is not null");
            return (Criteria) this;
        }

        public Criteria andGendarNmEqualTo(String value) {
            addCriterion("gendar_nm =", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmNotEqualTo(String value) {
            addCriterion("gendar_nm <>", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmGreaterThan(String value) {
            addCriterion("gendar_nm >", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmGreaterThanOrEqualTo(String value) {
            addCriterion("gendar_nm >=", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmLessThan(String value) {
            addCriterion("gendar_nm <", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmLessThanOrEqualTo(String value) {
            addCriterion("gendar_nm <=", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmLike(String value) {
            addCriterion("gendar_nm like", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmNotLike(String value) {
            addCriterion("gendar_nm not like", value, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmIn(List<String> values) {
            addCriterion("gendar_nm in", values, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmNotIn(List<String> values) {
            addCriterion("gendar_nm not in", values, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmBetween(String value1, String value2) {
            addCriterion("gendar_nm between", value1, value2, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andGendarNmNotBetween(String value1, String value2) {
            addCriterion("gendar_nm not between", value1, value2, "gendarNm");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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

        public Criteria andDeleteUserIdIsNull() {
            addCriterion("delete_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdIsNotNull() {
            addCriterion("delete_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdEqualTo(String value) {
            addCriterion("delete_user_id =", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotEqualTo(String value) {
            addCriterion("delete_user_id <>", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdGreaterThan(String value) {
            addCriterion("delete_user_id >", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("delete_user_id >=", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdLessThan(String value) {
            addCriterion("delete_user_id <", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdLessThanOrEqualTo(String value) {
            addCriterion("delete_user_id <=", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdLike(String value) {
            addCriterion("delete_user_id like", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotLike(String value) {
            addCriterion("delete_user_id not like", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdIn(List<String> values) {
            addCriterion("delete_user_id in", values, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotIn(List<String> values) {
            addCriterion("delete_user_id not in", values, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdBetween(String value1, String value2) {
            addCriterion("delete_user_id between", value1, value2, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotBetween(String value1, String value2) {
            addCriterion("delete_user_id not between", value1, value2, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampIsNull() {
            addCriterion("delete_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampIsNotNull() {
            addCriterion("delete_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampEqualTo(Date value) {
            addCriterion("delete_timestamp =", value, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampNotEqualTo(Date value) {
            addCriterion("delete_timestamp <>", value, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampGreaterThan(Date value) {
            addCriterion("delete_timestamp >", value, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_timestamp >=", value, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampLessThan(Date value) {
            addCriterion("delete_timestamp <", value, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampLessThanOrEqualTo(Date value) {
            addCriterion("delete_timestamp <=", value, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampIn(List<Date> values) {
            addCriterion("delete_timestamp in", values, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampNotIn(List<Date> values) {
            addCriterion("delete_timestamp not in", values, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampBetween(Date value1, Date value2) {
            addCriterion("delete_timestamp between", value1, value2, "deleteTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteTimestampNotBetween(Date value1, Date value2) {
            addCriterion("delete_timestamp not between", value1, value2, "deleteTimestamp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_gendar
     *
     * @mbg.generated do_not_delete_during_merge Sat Nov 26 13:37:05 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_gendar
     *
     * @mbg.generated Sat Nov 26 13:37:05 JST 2022
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