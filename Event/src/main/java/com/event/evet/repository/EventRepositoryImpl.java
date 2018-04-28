/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.evet.repository;

import com.event.evet.data.Event;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FRANK
 */
@Repository
public class EventRepositoryImpl implements EventRepository {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public List<Event> getEvents() {
        Query query = em.createNativeQuery("SELECT * FROM event");
        List<Object[]> events = query.getResultList();
        List<Event> eventos = new ArrayList<>();
        for(Object[] obj: events){
            Event event = new Event();
            event.setIdEvent((int) obj[0]);
            event.setName((String) obj[1]);
            event.setDescription((String) obj[2]);
            eventos.add(event);
        }            
        return eventos;
    }
    
}
