package com.qianfeng.microservice.provider.controller;

import com.qianfeng.microservice.provider.pojo.TbUser;
import com.qianfeng.microservice.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users/{id}")
    public TbUser getUserById(@PathVariable Long id) throws Exception{
        return userService.getUserById(id);
    }
}
