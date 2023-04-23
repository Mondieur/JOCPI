package com.ocpi.server.course;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Builder
@ToString
@Component
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
@EqualsAndHashCode(of = "id")
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Date dob; // date of birth

    @Column(name = "updated_at")
    private Date dou; // date of update

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "is_free")
    private boolean isFree;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "has_certificate")
    private boolean hasCertificate;
}
