package com.springlife.spring_life.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="ViewCount")
public class ViewCount {
    @Id @GeneratedValue
    private long id;
    @Column(length = 40, nullable = false)
    private String ip;
}
