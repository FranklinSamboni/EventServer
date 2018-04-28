/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.service;

import com.event.evet.repository.UserRepository;
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
        return null;
    }
    
}
