/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.controller;

import com.event.evet.service.UserService;
import com.event.evet.vo.UserVO;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FRANK
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/getUsers")
    public Map<String,Object> getUsers(){
        Map<String,Object> users = userService.getUsers();
        return users;
    }
    
    @PostMapping("/newUser")
    public Map<String,Object> newUser(@RequestBody UserVO user){
        Map<String,Object> response = userService.newUser(user);
        return response;
    }
}
