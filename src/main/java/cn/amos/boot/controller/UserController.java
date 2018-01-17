package cn.amos.boot.controller;

import cn.amos.boot.dao.mappers.ApplyMapper;
import cn.amos.boot.dao.mappers.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author DaoyuanWang
 * @version V1.0.0
 * @apiNote 用户相关
 * @date 2018/1/15
 */
@Controller
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserMapper userMapper;
    @Resource
    private ApplyMapper applyMapper;

    @GetMapping("user")
    @ResponseBody
    public String userAll() {
        LOGGER.info("sql query");
        return userMapper.selectById(1L).toString();
    }

    @GetMapping("apply")
    @ResponseBody
    public String apply() {
        LOGGER.info("sql query");
        return applyMapper.selectByApplyNo("aaa").toString();
    }

    @GetMapping("hello")
    @ResponseBody
    public String testRequest() {
        return "Welcome To Spring Boot World!";
    }

    @RequestMapping("page/user")
    public String pageUser(Model model) {
        model.addAttribute("users", userMapper.selectAll());
        return "user";
    }

    @RequestMapping("page/apply")
    public String pageApply(Model model) {
        model.addAttribute("hello", "啦啦啦");
        return "apply";
    }
}
