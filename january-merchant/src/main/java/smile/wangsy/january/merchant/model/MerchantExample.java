package smile.wangsy.january.merchant.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MerchantExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
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

        public Criteria andBeenDeletedIsNull() {
            addCriterion("been_deleted is null");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedIsNotNull() {
            addCriterion("been_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedEqualTo(Boolean value) {
            addCriterion("been_deleted =", value, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedNotEqualTo(Boolean value) {
            addCriterion("been_deleted <>", value, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedGreaterThan(Boolean value) {
            addCriterion("been_deleted >", value, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("been_deleted >=", value, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedLessThan(Boolean value) {
            addCriterion("been_deleted <", value, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("been_deleted <=", value, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedIn(List<Boolean> values) {
            addCriterion("been_deleted in", values, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedNotIn(List<Boolean> values) {
            addCriterion("been_deleted not in", values, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("been_deleted between", value1, value2, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andBeenDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("been_deleted not between", value1, value2, "beenDeleted");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Boolean value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Boolean value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Boolean value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Boolean value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Boolean value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Boolean> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Boolean> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Boolean value1, Boolean value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNull() {
            addCriterion("principal_name is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNotNull() {
            addCriterion("principal_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameEqualTo(String value) {
            addCriterion("principal_name =", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotEqualTo(String value) {
            addCriterion("principal_name <>", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThan(String value) {
            addCriterion("principal_name >", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("principal_name >=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThan(String value) {
            addCriterion("principal_name <", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("principal_name <=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLike(String value) {
            addCriterion("principal_name like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotLike(String value) {
            addCriterion("principal_name not like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIn(List<String> values) {
            addCriterion("principal_name in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotIn(List<String> values) {
            addCriterion("principal_name not in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameBetween(String value1, String value2) {
            addCriterion("principal_name between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotBetween(String value1, String value2) {
            addCriterion("principal_name not between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNull() {
            addCriterion("principal_mobile is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNotNull() {
            addCriterion("principal_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileEqualTo(String value) {
            addCriterion("principal_mobile =", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotEqualTo(String value) {
            addCriterion("principal_mobile <>", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThan(String value) {
            addCriterion("principal_mobile >", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThanOrEqualTo(String value) {
            addCriterion("principal_mobile >=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThan(String value) {
            addCriterion("principal_mobile <", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThanOrEqualTo(String value) {
            addCriterion("principal_mobile <=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLike(String value) {
            addCriterion("principal_mobile like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotLike(String value) {
            addCriterion("principal_mobile not like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIn(List<String> values) {
            addCriterion("principal_mobile in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotIn(List<String> values) {
            addCriterion("principal_mobile not in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileBetween(String value1, String value2) {
            addCriterion("principal_mobile between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotBetween(String value1, String value2) {
            addCriterion("principal_mobile not between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIsNull() {
            addCriterion("login_account is null");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIsNotNull() {
            addCriterion("login_account is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAccountEqualTo(String value) {
            addCriterion("login_account =", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotEqualTo(String value) {
            addCriterion("login_account <>", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountGreaterThan(String value) {
            addCriterion("login_account >", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountGreaterThanOrEqualTo(String value) {
            addCriterion("login_account >=", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLessThan(String value) {
            addCriterion("login_account <", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLessThanOrEqualTo(String value) {
            addCriterion("login_account <=", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLike(String value) {
            addCriterion("login_account like", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotLike(String value) {
            addCriterion("login_account not like", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIn(List<String> values) {
            addCriterion("login_account in", values, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotIn(List<String> values) {
            addCriterion("login_account not in", values, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountBetween(String value1, String value2) {
            addCriterion("login_account between", value1, value2, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotBetween(String value1, String value2) {
            addCriterion("login_account not between", value1, value2, "loginAccount");
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
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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