package com.rest.app.rest.Models;

import jakarta.persistence.*;

@Entity
@Table
public class User {

    // id will be unique for each user
    // it will identify each user hence IDENTITY
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // column tells mysql that these attributes will be a column
    @Column
    private String username;

    // plain text for now
    @Column
    private String password;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
