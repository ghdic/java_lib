package com.hello.spring_hello;

import com.hello.spring_hello.member.Grade;
import com.hello.spring_hello.member.Member;
import com.hello.spring_hello.member.MemberService;
import com.hello.spring_hello.member.MemberServiceImpl;
import com.hello.spring_hello.order.Order;
import com.hello.spring_hello.order.OrderService;
import com.hello.spring_hello.order.OrderServiceImpl;
import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
