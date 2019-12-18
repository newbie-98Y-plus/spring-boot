package com.springboot.springboot.controller;


import com.springboot.springboot.model.User;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2019/12/16
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findOne")
    public User oneUser() {
        User u = new User();
        return new User(1,"zhangsan","123abc",new Date());
    }

    @GetMapping("/findAll")
    public List<User> allUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(2,"lisi","abcdefg",new Date()));
        list.add(new User(3,"lisi","abcdefg",new Date()));
        list.add(new User(4,"lisi","abcdefg",new Date()));
        return list;
    }

    @RequestMapping("/getUser/{name}")
    public User getUser(@RequestParam(name = "id")Integer id, @PathVariable(name = "name")String name) throws ParseException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
        return new User(id,name,name,sdf.parse("2019-12-17"));
    }

    @RequestMapping("/getUser3")
    public User getUser(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    @RequestMapping("/getUser4")
    public User getUserById(User user) {
        System.out.println(user);
        return user;
    }
    @InitBinder
    private void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }
}
