package com.ghaoxiang.separation.controller;

import com.ghaoxiang.separation.entity.User;
import com.ghaoxiang.separation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author haoxiang_guo
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description UserController
 * @createTime 2020年03月28日 16:27:00
 */
@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /*
     * @title list
     * @description 查询全部user
     * @author haoxiang_guo
     * @param []
     * @updateTime 2020-03-28 22:55:49
     * @return java.util.List<com.ghaoxiang.separation.entity.User>
     * @throws
     */
    @GetMapping
    public List<User> list() {
        return userService.users();
    }

    /*
     * @title addUser
     * @description 新增单个user
     * @author haoxiang_guo
     * @param [user]
     * @updateTime 2020-03-28 22:55:59
     * @return java.lang.Long
     * @throws
     */
    @PostMapping
    public Long addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    /*
     * @title list
     * @description 删除单个user
     * @author haoxiang_guo
     * @param [id]
     * @updateTime 2020-03-28 21:11:02
     * @return java.lang.Long
     * @throws
     */
    @DeleteMapping(path = "/{id}")
    public Long deleteUser(@PathVariable(name = "id") int id) {
        return userService.deleteUser(id);
    }

    /*
     * @title addUser
     * @description 更新单个user
     * @author haoxiang_guo
     * @param [user]
     * @updateTime 2020-03-28 21:21:05
     * @return java.lang.Long
     * @throws
     */
    @PutMapping(path = "")
    public Long updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
