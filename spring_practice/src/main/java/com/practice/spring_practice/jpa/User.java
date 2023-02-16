package com.practice.spring_practice.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id @GeneratedValue
    long id;
    String username;
}
