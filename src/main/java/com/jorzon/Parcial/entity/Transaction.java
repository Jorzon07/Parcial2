package com.jorzon.Parcial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Transaction {
    @Id
    private long id;
}
