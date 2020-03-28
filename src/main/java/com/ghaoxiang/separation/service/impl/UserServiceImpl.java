package com.ghaoxiang.separation.service.impl;

import com.ghaoxiang.separation.entity.User;
import com.ghaoxiang.separation.mapper.UserMapper;
import com.ghaoxiang.separation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haoxiang_guo
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @Description UserServiceImpl
 * @createTime 2020年03月28日 16:27:00
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Long addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public Long deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public Long updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<User> users() {
        return userMapper.users();
    }
}
