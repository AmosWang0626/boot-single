package cn.amos.boot.model.request;

import lombok.Data;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Data
public class UserRequest {
    /**
     * 用户名字
     */
    private String name;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 手机号
     */
    private String phoneNo;
    /**
     * 用户住址
     */
    private String address;
    /**
     * 身份证号
     */
    private String identityNo;

}
