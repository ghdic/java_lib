package com.java_practice;


class TestClass {
    public static String s = new String("abcd");
}
public class Main {
    public static void main(String[] args) {
        TestClass t1 = new TestClass();
        TestClass t2 = new TestClass();
        t2.s = new String("ddfd");
        System.out.println(t1.s == t2.s);
    }
}