package com.example.springbootmaven.Entities;

import jakarta.persistence.*;
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name="Usertype")
    private String Usertype;

    @Column(name="Username")
    private String Username;

    @Column(name="Password")
    private String Password;

    @Column(name="Token")
    private String Token;

    public String getUsertype() {
        return Usertype;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getToken() {
        return Token;
    }
}
