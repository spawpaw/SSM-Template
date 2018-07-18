package com.spawpaw.ssm.common.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Restful 接口的模版
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
public class StdRestController<T, PK> {

    @RequestMapping(path = "", method = RequestMethod.POST)
    void create(HttpSession session, @RequestBody T requestBody) {
    }

    @RequestMapping(path = "", method = RequestMethod.PUT)
    void update(HttpSession session, @RequestBody T requestBody) {
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    CommonResponseWithPageInfo<List<T>> getList(HttpSession session,
                                                @RequestParam("currentPage") Integer currentPage,
                                                @RequestParam("pageSize") Integer pageSize ) {
        return null;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    T getById(HttpSession session, @PathVariable("id") PK id) {
        return null;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    T delete(HttpSession session, @PathVariable("id") PK id) {
        return null;
    }


}
