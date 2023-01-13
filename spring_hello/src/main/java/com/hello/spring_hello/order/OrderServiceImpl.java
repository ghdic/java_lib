package com.hello.spring_hello.order;

import com.hello.spring_hello.discount.DiscountPolicy;
import com.hello.spring_hello.discount.FixDiscountPolicy;
import com.hello.spring_hello.discount.RateDiscountPolicy;
import com.hello.spring_hello.member.Member;
import com.hello.spring_hello.member.MemberRepository;
import com.hello.spring_hello.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
