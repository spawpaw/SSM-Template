package com.spawpaw.ssm.controller;

import com.spawpaw.ssm.dao.ActorMapperx;
import com.spawpaw.ssm.entity.ActorEntity;
import com.spawpaw.ssm.entity.ActorExamplex;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By spawpaw@hotmail.com  2018-07-18
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@RestController
@RequestMapping(path = "test")
public class TestController {
    @Resource
    ActorMapperx mapper;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Map<String, Object> test() {
        Map<String, Object> data = new HashMap<>();

        ActorEntity actor = new ActorEntity();
        actor.setFirst_name("test_first_name");
        actor.setLast_name("test_last_name");
        actor.setIs_delete(false);
        mapper.insertSelective(actor);
        data.put("1actor_inserted", mapper.selectByPrimaryKey(actor.getActor_id()));

        ActorEntity actorUpdate = new ActorEntity();
        actorUpdate.setActor_id(actor.getActor_id());
        actorUpdate.setLast_name("last_name_changed");
        mapper.updateByPrimaryKeySelective(actorUpdate);
        data.put("2actor_updated", mapper.selectByPrimaryKey(actor.getActor_id()));

        long cntIdLargerThan100 = mapper.countByExample(new ActorExamplex().or().andActor_idGreaterThan(new Short("100")).example());
        data.put("3cntIdLargerThan100", cntIdLargerThan100);

        mapper.logicalDeleteByPrimaryKey(actor.getActor_id());
        data.put("4logicalDeleted", mapper.selectByPrimaryKey(actor.getActor_id()));

        return data;
    }
}
