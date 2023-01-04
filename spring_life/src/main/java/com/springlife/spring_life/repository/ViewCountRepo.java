package com.springlife.spring_life.repository;

import com.springlife.spring_life.model.ViewCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewCountRepo extends JpaRepository<ViewCount, Long> {
}
