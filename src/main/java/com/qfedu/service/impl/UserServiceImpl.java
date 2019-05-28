package com.qfedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.dao.UserMapper;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userDao;
	public User selectUserByUserId(String userId, String password) {
		// TODO Auto-generated method stub
		
		User user = userDao.selectUserByUserId(userId);
		if(user == null) {
			throw new RuntimeException("该用户不存在");
		}
		if(!user.getPassword().equals(password)) {
			throw new RuntimeException("密码错误");
		}
		
		return user;
	}

}
