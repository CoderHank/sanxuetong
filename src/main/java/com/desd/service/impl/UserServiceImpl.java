package com.desd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.desd.annotation.CheckUserLegal;
import com.desd.constant.ErrorType;
import com.desd.dao.IUserDao;
import com.desd.domain.User2;
import com.desd.exception.BusinessException;
import com.desd.param.BaseParam;
import com.desd.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	@Override
	public User2 getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	@Override
	@CheckUserLegal
	public User2 testGetUser(BaseParam<Integer> param) throws BusinessException{
		User2 result = null;
		if(param.getData() == null){
			
			throw new BusinessException(ErrorType.errorLoginInfo);
		}else{
			result = this.userDao.selectByPrimaryKey(param.getData());
		}
		return result;
	}

}
