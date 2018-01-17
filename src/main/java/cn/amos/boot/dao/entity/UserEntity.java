package cn.amos.boot.dao.entity;

import com.alibaba.fastjson.JSON;

/**
 * PROJECT: boot
 * DATE: 2018/1/12
 *
 * @author DaoYuanWang
 */
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
