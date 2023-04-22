package com.ocpi.server.course;

import com.ocpi.server.Sfew;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
public class CourseRoute {

    private final CourseService service;

    @PostMapping("/save")
    public void save(@RequestBody Course obj) {
        service.save(obj);
    }

    @GetMapping("/find/{id}")
    public Object find(@PathVariable int id) {
        return service.find(id);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Course obj) {
        return service.edit(obj);
    }

    @DeleteMapping("/wipe/{id}")
    public void wipe(@PathVariable int id) {
        service.wipe(id);
        System.out.println("deleted" + id);
    }

    @GetMapping("/all")
    public List<Object> findAll() {
        System.out.println("works!");
        return null;
    }
}
