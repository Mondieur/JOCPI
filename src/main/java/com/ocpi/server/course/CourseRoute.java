package com.ocpi.server.course;

import com.ocpi.server.Sfew;
import com.ocpi.server.user.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:9090")
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

    @GetMapping(name = "", value = {}, path = "/all", params = {}, headers = {}, consumes = {}, produces = {})
    public ResponseEntity<List<Object>> findAll() {
        List courses = service.findAll();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Cache-Control", "max-age=3600");

        System.out.println("courses (none):" + courses);
        System.out.println("headers (attr):" + headers);

        return ResponseEntity.ok().headers(headers).body(courses);
    }
}
