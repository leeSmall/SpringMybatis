package com.study.springmybatis.service;

import com.study.springmybatis.model.UserModel;

/**
 * 业务接口
 * @author lgs
 *
 */
public interface UserServiceI {

    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    UserModel getUserById(Integer userId);
}