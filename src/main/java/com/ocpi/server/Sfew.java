package com.ocpi.server;

public interface Sfek {
    Object save(Object obj);
    Object find(int id);
    Object edit(int id);
    Object kill(int id);
}
