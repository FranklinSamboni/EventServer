/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.service;

import com.event.evet.data.User;
import com.event.evet.repository.UserRepository;
import com.event.evet.vo.UserVO;
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

    public Map<String, Object> getUsers() {
        Iterable<User> users = userRepository.findAll();
        Map<String, Object> obj = new HashMap<>();
        obj.put("Users", users);
        return obj;
    }

    public Map<String, Object> newUser(UserVO userVO) {
        Map<String, Object> obj = new HashMap<>();
        try {
            User user = new User(userVO.getName(), userVO.getLastName(), userVO.getUsername(), userVO.getPassword());
            userRepository.save(user);
            obj.put("success", true);
        } catch (Exception e) {
            obj.put("success", false);
        }
        return obj;
    }

}
