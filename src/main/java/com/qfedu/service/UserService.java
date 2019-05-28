package com.qfedu.service;

import com.qfedu.entity.User;

public interface UserService {
	 //登录查询
    User selectUserByUserId(String userId, String password);
}
