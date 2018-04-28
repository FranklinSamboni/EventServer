/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.controller;

import com.event.evet.service.EventService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FRANK
 */
@RestController
@RequestMapping("/event")
public class EventController {
    
    @Autowired
    private EventService eventService;
    
    @GetMapping("/getEvents")
    public Map<String, Object> getEvents(){
        return eventService.getEvents();
    }
}
