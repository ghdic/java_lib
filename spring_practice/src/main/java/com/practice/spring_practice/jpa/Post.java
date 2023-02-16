package com.practice.spring_practice.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Post {
    @Id @GeneratedValue
    long id;
    String content;
}
