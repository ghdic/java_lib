package com.hello.spring_hello.discount;

import com.hello.spring_hello.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
