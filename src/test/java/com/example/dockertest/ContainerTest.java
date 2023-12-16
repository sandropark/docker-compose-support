package com.example.dockertest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;

@SpringBootTest
@Testcontainers
@ActiveProfiles("container")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)    // inmemory가 아닌 컨테이너를 사용하기 위해
class ContainerTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void contextLoads() {
        Member test = new Member("test");
        memberRepository.save(test);

        List<Member> all = memberRepository.findAll();
        System.out.println("all = " + all);
    }

}
