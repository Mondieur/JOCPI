package com.ocpi.server.course;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private LocalDateTime dob; // date of birth

    @Column(name = "updated_at")
    private LocalDateTime dou; // date of update

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
