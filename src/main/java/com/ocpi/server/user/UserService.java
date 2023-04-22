package com.ocpi.server.user;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public record UserService(UserRepo repo) {
    
    public User find(int id) {
        return repo.findById(id);
    }
    
    public String save(User obj) {
        repo.save(obj);
        return "saveUser() successfully!";
    }
    
    public List<User> findAll() {
        return repo.findAll();
    }
    
    public String edit(User obj) {

        User older = repo.findById(obj.getId()), newer;
        if (older == null) return "editById";

        newer = User.builder()
                .id(obj.getId())
                .name(obj.getName())
                .email(obj.getEmail())
                .password(obj.getPassword())
                .build();

        repo.save(newer);
        return "editById() successfully!";
    }
    
    public String wipe(int id) {
        repo.deleteById(id);
        return "deleteById() successfully!";
    }
}
