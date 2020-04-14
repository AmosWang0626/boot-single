package cn.amos.boot.service;

import cn.amos.boot.common.base.GeneralResponse;
import cn.amos.boot.model.request.UserRequest;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/17
 */
public interface UserService {

    /**
     * 注册用户
     *
     * @param userRequest 用户表单
     * @return 通用
     */
    GeneralResponse<String> generateUser(UserRequest userRequest);
}
