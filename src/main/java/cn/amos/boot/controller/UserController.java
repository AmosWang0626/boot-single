package cn.amos.boot.controller;

import cn.amos.boot.dao.mappers.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserMapper userMapper;

    @RequestMapping("user")
    public String userAll() {
        LOGGER.info("sql query");
        return userMapper.selectById(1L).toString();
    }

    @RequestMapping("hello")
    public String testRequest() {
        return "Welcome To Spring Boot World!";
    }
}
