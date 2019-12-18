package com.springboot.springboot.controller;

import com.springboot.springboot.model.UserBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@RestController
@EnableConfigurationProperties({UserBody.class})
public class UserBodyController {

    @Resource
    UserBody userBody;

    @GetMapping("/getUser")
    public String getUser(){
        return userBody.toString();
    }
}
