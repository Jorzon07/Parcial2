package com.jorzon.Parcial.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email", unique = true)
    private String email;

    @ManyToOne
    private Enterprise enterprise;

    private Date updateAt;

    private Date createdAt;
    public Employee(){
    }
    public Employee(long id, String email, Enterprise enterprise, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.enterprise = enterprise;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }
}
