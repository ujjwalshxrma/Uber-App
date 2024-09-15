package com.ujjwalsharma.project.uber.uberApp.entities;

import com.ujjwalsharma.project.uber.uberApp.entities.enums.Role;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="app-user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
