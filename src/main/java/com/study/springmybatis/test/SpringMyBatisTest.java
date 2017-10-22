package com.study.springmybatis.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.springmybatis.model.UserModel;
import com.study.springmybatis.service.UserServiceI;


@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class SpringMyBatisTest {

    //注入userService
	@Resource
    private UserServiceI userService;
    
    
    @Test
    public void testGetUserById(){
        int userId = 1;
        UserModel user = userService.getUserById(userId);
        System.out.println("查询到的用户名为："+user.getUsername());
    }
}