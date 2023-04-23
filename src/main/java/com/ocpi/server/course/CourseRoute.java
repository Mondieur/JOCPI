package com.ocpi.server.course;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:9090")
public class CourseRoute {

    private final CourseService service;

    @PostMapping
    public ResponseEntity save(@RequestBody Course obj) {
        service.save(obj);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @GetMapping("/{id}")
    public Course find(@PathVariable int id) {
        return service.find(id);
    }

    @PutMapping("/{id}")
    public String edit(@RequestBody Course obj) {
        return service.edit(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity wipe(@PathVariable int id) {
        service.wipe(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(name = "", value = {}, path = "/all", params = {}, headers = {}, consumes = {}, produces = {})
    public ResponseEntity<List<Object>> findAll() {
        List courses = service.findAll();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Cache-Control", "max-age=3600");

        System.out.println("courses (none):" + courses);
        System.out.println("headers (list):" + headers);

        return ResponseEntity.ok().headers(headers).body(courses);
    }
}
