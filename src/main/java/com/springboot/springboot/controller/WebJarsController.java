package com.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author
 * @version 1.0
 * @date 2019/12/17
 */
@Controller
public class WebJarsController {

    @GetMapping("/")
    public String HelloWebJars() {
        return "helloWebJars.html";
    }
}
