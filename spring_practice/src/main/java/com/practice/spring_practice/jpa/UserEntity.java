package com.practice.spring_practice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntity extends JpaRepository<User, Long> {
    User save(User user);
}
