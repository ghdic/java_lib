package com.practice.spring_practice.hello;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(name="Hello")
public class Hello {
    @Id @GeneratedValue
    long id;
    String name;

}
