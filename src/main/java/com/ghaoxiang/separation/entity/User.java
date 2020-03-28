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
    private String name;
    private int age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
