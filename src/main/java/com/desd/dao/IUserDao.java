package com.desd.dao;

import org.springframework.stereotype.Repository;

import com.desd.domain.User2;


@Repository("userDao")
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User2 record);

    int insertSelective(User2 record);

    User2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User2 record);

    int updateByPrimaryKey(User2 record);
}