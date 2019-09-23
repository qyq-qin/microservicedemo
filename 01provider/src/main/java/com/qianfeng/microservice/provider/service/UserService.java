package com.qianfeng.microservice.provider.service;

import com.qianfeng.microservice.provider.pojo.TbUser;

public interface UserService {

    TbUser getUserById(Long id) throws Exception;
}
