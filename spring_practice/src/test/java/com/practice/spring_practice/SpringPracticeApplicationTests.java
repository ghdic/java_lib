package com.practice.spring_practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringPracticeApplicationTests {

    @Test
    void contextLoads() {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringPracticeApplication.class);
        System.out.println(context);
    }

}
