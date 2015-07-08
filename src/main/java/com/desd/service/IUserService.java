package com.desd.service;

import com.desd.domain.User2;
import com.desd.exception.BusinessException;
import com.desd.param.BaseParam;


public interface IUserService {
	public User2 getUserById(int userId);
	public User2 testGetUser(BaseParam<Integer> param) throws BusinessException;
}
