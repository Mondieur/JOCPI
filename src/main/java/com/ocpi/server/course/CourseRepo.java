package com.ocpi.server.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {


    Course findById(int id);
    List<Course> findAll();
    void deleteById(int id);
}
