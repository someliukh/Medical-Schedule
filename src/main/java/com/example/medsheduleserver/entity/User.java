package com.example.medsheduleserver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name; // firstName and lastName

    @Column(name = "password")
    private String password;

    @Column(name = "jobTitle")
    private String jobTitle; // посада
}
