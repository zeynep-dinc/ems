package com.bizimkiler.ems.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name",length = 30,nullable = false)
    private String firstName;

    @Column(name = "last_name",length=30,nullable = false)
    private String lastName;

    @Column(name = "email",nullable = true)
    private String email;

}
