package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // @Component("service") -> 'memberServiceImpl'가 아닌 'service'로 이름 직접 설정 가능
public class MemberServiceImpl implements MemberService {
    //DIP 위반
    // private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 생성자 주입 (추상화에만 의존하고 생성자를 통해 사용할 객체가 주입됨)
    private MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }



    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


    // 테스트 용도
//    private final MemberRepository memberRepository;

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
