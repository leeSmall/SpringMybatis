package com.study.springmybatis.dao;

import org.springframework.stereotype.Repository;

import com.study.springmybatis.model.UserModel;

/**
 * 用户接口
 * 
 * @author lgs
 *
 */
@Repository("userDao")
public interface UserDao {
	int deleteByPrimaryKey(Integer id);

	int insert(UserModel record);

	int insertSelective(UserModel record);

	UserModel selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(UserModel record);

	int updateByPrimaryKey(UserModel record);
}