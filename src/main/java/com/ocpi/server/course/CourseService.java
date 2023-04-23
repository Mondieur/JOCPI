package com.ocpi.server.course;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public record CourseService(CourseRepo repo) {

    public Course save(Course obj) {
        repo.save(obj);
        return obj;
    }

    public Course find(int id) {
        return repo.findById(id);
    }

    public String edit(Course obj) {

        Course older = repo.findById(obj.getId()), newer;
        if (older == null) return "editById";

        newer = Course.builder()
                .id(obj.getId())
                .dob(obj.getDob())
                .dou(obj.getDou())
                .title(obj.getTitle())
                .summary(obj.getSummary())
                .imageUrl(obj.getImageUrl())
                .isFree(obj.isFree())
                .price(obj.getPrice())
                .hasCertificate(obj.isHasCertificate())
                .build();

        repo.save(newer);
        return "editById() worked!";
    }

    public void wipe(int id) {
        repo.deleteById(id);
    }

    public List<Course> findAll() {
        return repo.findAll();
    }
}
