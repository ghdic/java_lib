package com.hello.spring_hello;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLife {
    List<Integer> a = new ArrayList();
    @BeforeEach
    public void setUp() {
        a.add(1);
        System.out.println("Before");
    }

    @Test
    public void testA() {
        System.out.println(a);
        System.out.println("testA");
    }

    @Test
    public void testB() {
        System.out.println(a);
        System.out.println("testB");
    }
}
