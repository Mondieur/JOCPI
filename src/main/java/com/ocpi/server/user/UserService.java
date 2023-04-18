package com.ocpi.server.user;

import com.ocpi.server.utensils.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record UserService(UserRepo repo) {
    
    public User findById(int id) {
        return repo.findById(id);
    }
    
    public String saveUser(User user) {
        repo.save(user);
        return Log.done("saveUser() successfully!");
    }
    
    public List<User> findUsers() {
        return repo.findAll();
    }
    
    public String editById(User user) {
        
        User older = repo.findById(user.getId()), newer;
        if (older == null) return Log.warn("editById");
        
        newer = User.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
        
        repo.save(newer);
        return Log.done("editById() successfully!");
    }
    
    public String deleteById(int id) {
        repo.deleteById(id);
        return Log.done("deleteById() successfully!");
    }
}
