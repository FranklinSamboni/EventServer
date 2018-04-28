/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.service;

import com.event.evet.data.Event;
import com.event.evet.repository.EventRepository;
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
public class EventService {

    @Autowired
    private EventRepository eventRepository;
    
    public Map<String, Object> getEvents() {
        List<Event> events = eventRepository.getEvents();
        Map<String,Object> obj = new HashMap<>();
        obj.put("Events", events);
        return obj;
    }
    
}
