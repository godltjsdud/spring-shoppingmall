package com.example.shoppingmall;

import com.example.shoppingmall.member.Member;
import com.example.shoppingmall.member.MemberJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomApplicationRunner implements ApplicationRunner {
    @Autowired
    MemberJPARepository memberJPARepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Optional<Member> resultMember = memberJPARepository.findByUserId("songa");
        if(resultMember == null){
            System.out.println("null!!!!");
        }else{
            System.out.println(resultMember);
        }
        System.out.println("진짜 동시에 실행된다니까???");
    }
}
