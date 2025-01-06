package hello.core.member;

public class MemberServiceImpl implements MemberService {
    //DIP 위반
    // private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 생성자 주입 (추상화에만 의존하고 생성자를 통해 사용할 객체가 주입됨)
    private MemberRepository memberRepository;

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
