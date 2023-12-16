package com.example.dockertest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
public class InmemTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void test() throws Exception {
        Member test = new Member("test");
        memberRepository.save(test);

        System.out.println("memberRepository.findAll() = " + memberRepository.findAll());
    }
}
