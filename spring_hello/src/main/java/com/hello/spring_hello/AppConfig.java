package com.hello.spring_hello;

import com.hello.spring_hello.discount.RateDiscountPolicy;
import com.hello.spring_hello.member.MemberService;
import com.hello.spring_hello.member.MemberServiceImpl;
import com.hello.spring_hello.member.MemoryMemberRepository;
import com.hello.spring_hello.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderServiceImpl orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public RateDiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
