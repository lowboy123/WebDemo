package org.lowboy.user.controller;

import org.lowboy.entity.UserBo;
import org.lowboy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hellomapper")
    public String findMapper() {
        List<UserBo> userBos = userService.allList();
        return userBos + ".";
    }
}
