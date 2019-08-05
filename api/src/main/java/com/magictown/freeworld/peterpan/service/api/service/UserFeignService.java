/**
 * @create 2019-08-05 17:26
 * @desc user service
 **/
package com.magictown.freeworld.peterpan.service.api.service;

import com.magictown.freeworld.peterpan.service.api.pojo.UserFeignPOJO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserFeignService {

    @RequestMapping(value = "/testCall",method = RequestMethod.GET)
    public List<String> testCall();

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public UserFeignPOJO getByID(@RequestParam(value = "id")Long id);

    @RequestMapping(value = "/get",method = RequestMethod.POST)
    public UserFeignPOJO getByIdPost(@RequestBody Long id);

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public UserFeignPOJO add(@RequestParam("id")Long id,@RequestParam("name")String name);

    @RequestMapping(value = "/addJson",method = RequestMethod.POST)
    public UserFeignPOJO add(@RequestBody UserFeignPOJO userFeignPOJO);
}

