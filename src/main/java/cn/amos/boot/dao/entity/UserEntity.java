package cn.amos.boot.dao.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * PROJECT: boot
 * DATE: 2018/1/12
 *
 * @author DaoYuanWang
 */
@Getter
@Setter
public class UserEntity {

    private Long id;
    /**
     * 用户编号
     */
    private String userId;
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
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
