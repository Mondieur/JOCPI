package com.ocpi.server.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.util.UUID;
import static jakarta.persistence.GenerationType.UUID;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@EqualsAndHashCode(of = "id")
public class User {
    
    // @Id
    // @GeneratedValue(strategy = UUID)
    // private UUID uuid;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
}