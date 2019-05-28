package com.qfedu.dao;

import com.qfedu.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //登录查询
    User selectUserByUserId(String userId);
    
    
    
    
}