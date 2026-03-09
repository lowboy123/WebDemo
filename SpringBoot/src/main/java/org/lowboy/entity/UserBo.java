package org.lowboy.entity;

import org.apache.ibatis.annotations.Param;

public class UserBo {
    private Integer id;

    private String userName;

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
