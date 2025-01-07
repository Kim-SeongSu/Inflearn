package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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

    // 의존성 주입 적용
    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
//    private final MemberRepository memberRepository;
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
