package com.jorzon.Parcial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Enterprise {
    @Id
    private long id;

    @OneToMany
    private Employee employee;
}
