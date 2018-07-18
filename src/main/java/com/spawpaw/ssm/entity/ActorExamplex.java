package com.spawpaw.ssm.entity;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ActorExamplex {

    /**
     * @mbg.generated Wed Jul 18 19:07:34 CST 2018
     */
    public ActorExamplex() {
        oredCriteria = new ArrayList<Criteria>();
    }

    private Integer offset;

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    protected String orderByClause;

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    protected boolean distinct;

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public ActorExamplex orderBy(String... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if (pageSize < 1)
            throw new IllegalArgumentException("页大小不能小于1！");
        this.limit = pageSize;
        if (currentPage < 1)
            throw new IllegalArgumentException("页数不能小于1！");
        this.offset = (currentPage - 1) * pageSize;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public ActorExamplex orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 18 19:38:47 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        /**
         * @mbg.generated Wed Jul 18 19:07:34 CST 2018
         */
        protected Criteria(ActorExamplex example) {
            super();
            this.example = example;
        }

        /**
         * Corresponding to the database table actor
         *
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        private ActorExamplex example;

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        public ActorExamplex example() {
            return this.example;
        }

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        @Deprecated
        public Criteria andDeleted(boolean deleted) {
            return deleted ? andIs_deleteEqualTo(ActorEntity.DELETED) : andIs_deleteNotEqualTo(ActorEntity.DELETED);
        }

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deleteEqualTo(ActorEntity.DELETED) : andIs_deleteNotEqualTo(ActorEntity.DELETED);
        }

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public interface ICriteriaAdd {

            /**
             * @mbg.generated Wed Jul 18 19:38:47 CST 2018
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    protected abstract static class GeneratedCriteria {

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        protected List<Criterion> criteria;

        public Criteria andIs_deleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andActor_idBetween(Short value1, Short value2) {
            addCriterion("actor_id between", value1, value2, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idIsNull() {
            addCriterion("actor_id is null");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThan(Date value) {
            addCriterion("last_update >", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andActor_idGreaterThanOrEqualTo(Short value) {
            addCriterion("actor_id >=", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andLast_nameIsNotNull() {
            addCriterion("last_name is not null");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotEqualTo(String value) {
            addCriterion("last_name <>", value, "last_name");
            return (Criteria) this;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public Criteria andLast_nameGreaterThanOrEqualTo(String value) {
            addCriterion("last_name >=", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andLast_nameLessThan(String value) {
            addCriterion("last_name <", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLessThan(String value) {
            addCriterion("first_name <", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andActor_idLessThan(Short value) {
            addCriterion("actor_id <", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotIn(List<String> values) {
            addCriterion("last_name not in", values, "last_name");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andActor_idNotIn(List<Short> values) {
            addCriterion("actor_id not in", values, "actor_id");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andLast_nameGreaterThan(String value) {
            addCriterion("last_name >", value, "last_name");
            return (Criteria) this;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public Criteria andFirst_nameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "first_name");
            return (Criteria) this;
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public Criteria andFirst_nameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andActor_idIsNotNull() {
            addCriterion("actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andLast_nameBetween(String value1, String value2) {
            addCriterion("last_name between", value1, value2, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_nameLike(String value) {
            addCriterion("last_name like", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotLike(String value) {
            addCriterion("first_name not like", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotBetween(String value1, String value2) {
            addCriterion("last_name not between", value1, value2, "last_name");
            return (Criteria) this;
        }

        public Criteria andActor_idIn(List<Short> values) {
            addCriterion("actor_id in", values, "actor_id");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "first_name");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThan(Date value) {
            addCriterion("last_update <", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andActor_idNotBetween(Short value1, Short value2) {
            addCriterion("actor_id not between", value1, value2, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idLessThanOrEqualTo(Short value) {
            addCriterion("actor_id <=", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andLast_updateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotLike(String value) {
            addCriterion("last_name not like", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "first_name");
            return (Criteria) this;
        }

        public Criteria andLast_updateIn(List<Date> values) {
            addCriterion("last_update in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andFirst_nameGreaterThan(String value) {
            addCriterion("first_name >", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameEqualTo(String value) {
            addCriterion("first_name =", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateEqualTo(Date value) {
            addCriterion("last_update =", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_nameEqualTo(String value) {
            addCriterion("last_name =", value, "last_name");
            return (Criteria) this;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFirst_nameLike(String value) {
            addCriterion("first_name like", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLikeInsensitive(String value) {
            addCriterion("upper(first_name) like", value.toUpperCase(), "first_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLessThanOrEqualTo(String value) {
            addCriterion("last_name <=", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLikeInsensitive(String value) {
            addCriterion("upper(last_name) like", value.toUpperCase(), "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andActor_idEqualTo(Short value) {
            addCriterion("actor_id =", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idGreaterThan(Short value) {
            addCriterion("actor_id >", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andLast_nameIsNull() {
            addCriterion("last_name is null");
            return (Criteria) this;
        }

        public Criteria andActor_idNotEqualTo(Short value) {
            addCriterion("actor_id <>", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andLast_nameIn(List<String> values) {
            addCriterion("last_name in", values, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIn(List<String> values) {
            addCriterion("first_name in", values, "first_name");
            return (Criteria) this;
        }
    }

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public static class Criterion {

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
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

        private String condition;

        private boolean singleValue;

        private boolean noValue;

        private Object secondValue;

        private Object value;

        private String typeHandler;

        private boolean betweenValue;

        private boolean listValue;

        public boolean isSingleValue() {
            return singleValue;
        }

        public String getCondition() {
            return condition;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public boolean isListValue() {
            return listValue;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public Object getValue() {
            return value;
        }
    }
}
