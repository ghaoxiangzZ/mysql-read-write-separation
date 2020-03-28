package com.ghaoxiang.separation.controller;

import com.ghaoxiang.separation.entity.User;
import com.ghaoxiang.separation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * @updateTime 2020-03-28 21:07:34
     * @return java.lang.Object
     * @throws
     */
    @GetMapping(path = "")
    public Object list() {
        return userService.users();
    }

    /*
     * @title addUser
     * @description 新增一个user
     * @author haoxiang_guo
     * @param [user]
     * @updateTime 2020-03-28 21:08:04
     * @return java.lang.Object
     * @throws
     */
    @PostMapping(path = "")
    public Object addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    /*
     * @title list
     * @description 删除一个user
     * @author haoxiang_guo
     * @param [id]
     * @updateTime 2020-03-28 21:11:02
     * @return java.lang.Object
     * @throws
     */
    @DeleteMapping(path = "/{id}")
    public Object deleteUser(@PathVariable(name = "id") int id) {
        return userService.deleteUser(id);
    }

    /*
     * @title addUser
     * @description 更新一个user
     * @author haoxiang_guo
     * @param [user]
     * @updateTime 2020-03-28 21:21:05
     * @return java.lang.Object
     * @throws
     */
    @PutMapping(path = "")
    public Object updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
