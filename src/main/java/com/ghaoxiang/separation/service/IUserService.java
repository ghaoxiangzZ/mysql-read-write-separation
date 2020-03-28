package com.ghaoxiang.separation.service;

import com.ghaoxiang.separation.entity.User;

import java.util.List;

/**
 * @author haoxiang_guo
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description User Service
 * @createTime 2020年03月28日 16:26:00
 */
public interface IUserService {

    Long addUser(User user);

    Long deleteUser(int id);

    Long updateUser(User user);

    List<User> users();
}
