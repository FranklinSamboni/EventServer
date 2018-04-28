/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.repository;

import com.event.evet.data.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author FRANK
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    
}
