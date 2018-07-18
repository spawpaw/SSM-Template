package com.spawpaw.ssm.entity;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 *
 * @author
 * @mbg.generated
 */
@Table(name = "`actor`")
public class ActorEntity implements Serializable {

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    @Deprecated
    public static final Boolean DEL_FLAG_OFF = true;

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    @Deprecated
    public static final Boolean DEL_FLAG_ON = false;

    /**
     * Corresponding to the database column actor.is_delete
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    private Boolean is_delete;

    /**
     * Corresponding to the database column actor.last_name
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    private String last_name;

    /**
     * Corresponding to the database column actor.actor_id
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    private Short actor_id;

    /**
     * Corresponding to the database column actor.last_update
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    private Date last_update;

    /**
     * Corresponding to the database column actor.first_name
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    private String first_name;

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * Corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public static final Boolean DELETED = true;

    /**
     * This method returns the value of the database column actor.last_update
     *
     * @return the value of actor.last_update
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     * This method sets the value of the database column actor.actor_id
     *
     * @param actor_id the value for actor.actor_id
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void setActor_id(Short actor_id) {
        this.actor_id = actor_id;
    }

    /**
     * This method returns the value of the database column actor.actor_id
     *
     * @return the value of actor.actor_id
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public Short getActor_id() {
        return actor_id;
    }

    /**
     * This method sets the value of the database column actor.last_name
     *
     * @param last_name the value for actor.last_name
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * This method sets the value of the database column actor.last_update
     *
     * @param last_update the value for actor.last_update
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void andLogicalDeleted(boolean deleted) {
        setIs_delete(deleted ? DELETED : NOT_DELETED);
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public ActorEntity withActor_id(Short actor_id) {
        this.setActor_id(actor_id);
        return this;
    }

    /**
     * This method returns the value of the database column actor.first_name
     *
     * @return the value of actor.first_name
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actor_id=").append(actor_id);
        sb.append(", first_name=").append(first_name);
        sb.append(", last_name=").append(last_name);
        sb.append(", last_update=").append(last_update);
        sb.append(", is_delete=").append(is_delete);
        sb.append("]");
        return sb.toString();
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public ActorEntity withIs_delete(Boolean is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public ActorEntity withLast_name(String last_name) {
        this.setLast_name(last_name);
        return this;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public ActorEntity withLast_update(Date last_update) {
        this.setLast_update(last_update);
        return this;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ActorEntity other = (ActorEntity) that;
        return (this.getActor_id() == null ? other.getActor_id() == null : this.getActor_id().equals(other.getActor_id())) && (this.getFirst_name() == null ? other.getFirst_name() == null : this.getFirst_name().equals(other.getFirst_name())) && (this.getLast_name() == null ? other.getLast_name() == null : this.getLast_name().equals(other.getLast_name())) && (this.getLast_update() == null ? other.getLast_update() == null : this.getLast_update().equals(other.getLast_update())) && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    /**
     * This method sets the value of the database column actor.first_name
     *
     * @param first_name the value for actor.first_name
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public ActorEntity withFirst_name(String first_name) {
        this.setFirst_name(first_name);
        return this;
    }

    /**
     * This method returns the value of the database column actor.is_delete
     *
     * @return the value of actor.is_delete
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public Boolean getIs_delete() {
        return is_delete;
    }

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActor_id() == null) ? 0 : getActor_id().hashCode());
        result = prime * result + ((getFirst_name() == null) ? 0 : getFirst_name().hashCode());
        result = prime * result + ((getLast_name() == null) ? 0 : getLast_name().hashCode());
        result = prime * result + ((getLast_update() == null) ? 0 : getLast_update().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }

    /**
     * This method sets the value of the database column actor.is_delete
     *
     * @param is_delete the value for actor.is_delete
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method returns the value of the database column actor.last_name
     *
     * @return the value of actor.last_name
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * corresponding to the database table actor
     *
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    public enum Column {

        actor_id("actor_id"), first_name("first_name"), last_name("last_name"), last_update("last_update"), is_delete("is_delete");

        /**
         * Corresponding to the database table actor
         *
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        private final String column;

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        public String value() {
            return this.column;
        }

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        public String getValue() {
            return this.column;
        }

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * @mbg.generated Wed Jul 18 19:38:47 CST 2018
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}
