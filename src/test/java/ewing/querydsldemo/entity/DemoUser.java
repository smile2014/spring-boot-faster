package ewing.querydsldemo.entity;

import javax.annotation.Generated;

/**
 * DemoUser is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class DemoUser {

    private Integer addressId;

    private java.util.Date birthday;

    private Integer gender;

    private String password;

    private Integer userId;

    private String username;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

