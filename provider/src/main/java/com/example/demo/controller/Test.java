package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.service.UserService;
import com.example.demo.utils.ReqException;
import com.example.demo.utils.ResponseResult;

@Controller
@RequestMapping("/api")
public class Test {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = { RequestMethod.POST })
    @ResponseBody
    public ResponseResult<?> login(@RequestBody User user) throws ReqException {
        userService.save(user);
        return new ResponseResult<>(0, "success", user);
    }
}
