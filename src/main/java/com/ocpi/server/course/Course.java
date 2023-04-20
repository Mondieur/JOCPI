package com.ocpi.server.course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private String owner;
    private String title;
    private String detail;
    private long price;
    private Date timestamp;
}
