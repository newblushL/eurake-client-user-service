package com.example.eurake.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: ll
 * @create: 2019-07-30 15:22
 */
@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String helleo(){
        return "hello";
    }

}