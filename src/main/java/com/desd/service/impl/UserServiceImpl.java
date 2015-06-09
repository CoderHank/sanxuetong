package com.desd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.desd.dao.IUserDao;
import com.desd.domain.User;
import com.desd.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	}

}