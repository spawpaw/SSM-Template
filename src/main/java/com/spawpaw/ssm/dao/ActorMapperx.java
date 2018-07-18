package com.spawpaw.ssm.dao;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import javax.persistence.GeneratedValue;
import org.apache.ibatis.annotations.Mapper;
import com.spawpaw.ssm.entity.ActorEntity;
import com.spawpaw.ssm.entity.ActorExamplex;
import javax.persistence.Id;

@Mapper
public interface ActorMapperx {

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int insertSelective(ActorEntity record);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int logicalDeleteByPrimaryKey(Short actor_id);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    long countByExample(ActorExamplex example);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int batchInsertSelective(@Param("list") List<ActorEntity> list, @Param("selective") ActorEntity.Column... selective);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int insert(ActorEntity record);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int updateByExample(@Param("record") ActorEntity record, @Param("example") ActorExamplex example);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    List<ActorEntity> selectByExample(ActorExamplex example);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int deleteByExample(ActorExamplex example);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int updateByPrimaryKey(ActorEntity record);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    ActorEntity selectByPrimaryKey(Short actor_id);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    ActorEntity selectByPrimaryKeyWithLogicalDelete(@Param("actor_id") Short actor_id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int logicalDeleteByExample(@Param("example") ActorExamplex example);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int updateByPrimaryKeySelective(ActorEntity record);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActorEntity record, @Param("example") ActorExamplex example);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int deleteByPrimaryKey(Short actor_id);

    /**
     * @mbg.generated Wed Jul 18 19:38:47 CST 2018
     */
    int batchInsert(@Param("list") List<ActorEntity> list);
}
