package com.ocpi.server.course;

import com.ocpi.server.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CourseService(CourseRepo repo) {

    public void save(Course obj) {
        repo.save(obj);
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
        return "editById() successfully!";
    }

    public void wipe(int id) {
        repo.deleteById(id);
    }

    public List<Course> findAll() {
        return repo.findAll();
    }
}
