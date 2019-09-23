package com.qianfeng.microservice.provider.service.impl;

import com.qianfeng.microservice.provider.pojo.TbUser;
import com.qianfeng.microservice.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserService userService;
    @Override
    public TbUser getUserById(Long id) throws Exception {
        return userService.getUserById(id);
    }
}
