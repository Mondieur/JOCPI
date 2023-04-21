package com.ocpi.server.course;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.sql.Time;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String summary;
    private String instructor;
    private float price;


    private int numberOfSections;
    private int numberOfLectures;
    private int numberOfStudents;

    private boolean isActive;
    private boolean hasCertificate;
}
