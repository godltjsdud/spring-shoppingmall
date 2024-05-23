package com.example.shoppingmall.member;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MemberService {

    MemberJPARepository memberRepository;

    @Transactional
    public String join(Member member) {
        memberRepository.save(member);

        String userId = memberRepository.findByUserId(member.getUserId()).get().getUserId();

        System.out.println("예외처리를 해도 트랜잭션은 마무리 될까요?");

        return userId;
    }

    public boolean checkDuplicateId(String userId) {
        Optional<Member> existMember
                = memberRepository.findByUserId(userId);

        if (existMember.isEmpty())
            return false;
        else
            return true;
    }

    public boolean authenticate(String userId, String pw) {
        Optional<Member> existMember
                = memberRepository.findByUserIdAndPw(userId,pw);

//        Optional<Member> existMember = memberRepository.findByUserId(userId);
        if (!existMember.isEmpty()) {
            Member member = existMember.get();
            return true;
        }

        return false;

    }
}
