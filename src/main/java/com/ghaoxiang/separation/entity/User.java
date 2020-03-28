package com.ghaoxiang.separation.entity;

import java.io.Serializable;

/**
 * @author haoxiang_guo
 * @version 1.0.0
 * @ClassName User.java
 * @Description User entity
 * @createTime 2020年03月28日 16:15:00
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1205226416664488559L;
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
