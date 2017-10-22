package com.study.springmybatis.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.springmybatis.dao.UserDao;
import com.study.springmybatis.model.UserModel;

/**
 * 业务实现类
 * @author lgs
 *
 */
@Service("userService")
public class UserService implements UserServiceI {

	/**
     * 使用Resource注解注入userDao实例，
     * 当需要使用userDao时，Spring就会自动注入UserDao
     */
	@Resource
    private UserDao userDao;

    public UserModel getUserById(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
