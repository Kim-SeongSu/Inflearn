package hello.core.order;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor    // lombok 추가 - 생성자 자동 생성 라이브러리 제공
public class OrderServiceImpl implements OrderService {
    /**
     * 할인 정책을 변경하려면 코드 자체를 변경해야하는 문제가 발생 (DIP 위반)
     * >> 의존성 주입(DI)으로 문제 해결 (추상(interface)에만 의존하도록 변경 )
     */
    /*
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 정액 할인 정책
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    // 퍼센트 할인 정책
    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
     */


    /**
     * 기본 코드 - 생성자 생성 필요
     */

    // 의존성 주입 적용
    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    @Autowired  // 생성자가 한 개 뿐이라 @Autowired 생략 가능
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }



    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }


    /**
     * 롬봄 라이브러리 @RequiredArgsConstructor 기능 사용 (build.gradle에 환경 설정 추가 필요)
     */
    /*
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
    */



// 롬복 라이브러리 사용으로 getMemberRepository 오버라이드 못함 (중복)
    // 테스트 용도
    //    private final MemberRepository memberRepository;
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
