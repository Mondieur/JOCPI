package com.ocpi.server;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Component
public interface Sfew {
    @PostMapping("")
    void save(Object obj);
    @GetMapping("")
    void find(int id);
    @PutMapping("")
    void edit(Object obj);
    @DeleteMapping("")
    void wipe(int id);
    @GetMapping("")
    void findAll();
}
