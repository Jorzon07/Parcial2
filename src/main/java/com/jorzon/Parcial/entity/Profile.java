package com.jorzon.Parcial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@Entity
public class Profile {
@Id
    private String id;
    private String image;
    private String phone;



}
