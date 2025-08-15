package com.erp.MadeiSys.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;


    @Column(name = "password", length = 30, nullable = false)
    private String password;
}
