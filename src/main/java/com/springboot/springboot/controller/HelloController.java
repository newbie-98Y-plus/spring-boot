package com.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @version 1.0
 * @date 2019/12/16
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    //@ResponseBody
    public String sayHello(String str) {
        str = "hello springboot";
        return str;
    }
}
