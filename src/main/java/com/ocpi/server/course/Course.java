package com.ocpi.server.course;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String summary;
    private String instructor;
    private long price;

    private int numSections;
    private int numLectures;
    private int numStudents;

    private boolean isPublic;
    private boolean hasCertificate;
}
