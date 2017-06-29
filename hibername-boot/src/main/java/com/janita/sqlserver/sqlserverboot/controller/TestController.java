package com.janita.sqlserver.sqlserverboot.controller;

import com.janita.sqlserver.sqlserverboot.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/29 0029-下午 5:41
 * 该类是：
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @PostMapping
    public User add(@RequestBody User user) {
        return user;
    }
}
