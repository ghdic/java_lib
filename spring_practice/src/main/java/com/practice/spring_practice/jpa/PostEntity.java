package com.practice.spring_practice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntity extends JpaRepository<Post, Long> {
    Post save(Post post);
}
