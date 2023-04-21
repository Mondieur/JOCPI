package com.ocpi.server;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface Sfew {
    void save(Object obj);    // create
    Object find(int id);        // read
    Object edit(Object obj);    // update
    void wipe(int id);        // delete

    List<Object> findAll(); // all objects
}
