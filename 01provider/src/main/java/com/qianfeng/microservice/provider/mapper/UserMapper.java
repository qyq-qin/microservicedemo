package com.qianfeng.microservice.provider.mapper;

import com.qianfeng.microservice.provider.pojo.TbUser;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    TbUser getUserById(Long id);
}
