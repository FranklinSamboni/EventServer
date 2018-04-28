/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.service;

import com.event.evet.data.User;
import com.event.evet.repository.UserRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FRANK
 */
@Service
public class UserService {

    
    @Autowired
    private UserRepository userRepository;
    
    public Map<String,Object> getUsers() {
        Iterable<User> users = userRepository.findAll();
        Map<String,Object> obj = new HashMap<>();
        obj.put("Users", users);
        return obj;
    }
    
}
