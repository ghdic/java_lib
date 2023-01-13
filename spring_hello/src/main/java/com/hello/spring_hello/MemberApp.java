package com.hello.spring_hello;

import com.hello.spring_hello.member.Grade;
import com.hello.spring_hello.member.Member;
import com.hello.spring_hello.member.MemberService;
import com.hello.spring_hello.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        MemberService memberService = new AppConfig().memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class); // 메서드 이름
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
