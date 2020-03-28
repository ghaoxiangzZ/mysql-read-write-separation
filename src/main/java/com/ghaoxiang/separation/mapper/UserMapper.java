package com.ghaoxiang.separation.mapper;

/**
 * @author haoxiang_guo
 * @version 1.0.0
 * @ClassName UserMapper.java
 * @Description User Mapper
 * @createTime 2020年03月28日 16:16:00
 */

import com.ghaoxiang.separation.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    Long addUser(User user);

    Long deleteUser(int id);

    Long updateUser(User user);

    List<User> users();
}
