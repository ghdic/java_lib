package com.springlife.spring_life.service;

import com.springlife.spring_life.repository.ViewCountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewCountService {
    private ViewCountRepo viewCountRepo;

    @Autowired
    public ViewCountService(ViewCountRepo viewCountRepo) {
        this.viewCountRepo = viewCountRepo;
    }

    public
}
