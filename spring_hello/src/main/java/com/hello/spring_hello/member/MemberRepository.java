package com.hello.spring_hello.member;

public interface MemberRepository {

    void save(Member meber);
    Member findById(Long memberId);
}
