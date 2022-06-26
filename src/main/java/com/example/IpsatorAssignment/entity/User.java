package com.example.IpsatorAssignment.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    @Column(name = "user_id")
    private Long id;
    private String username;
    private String password;
    private String email;
    private String roles;


}
