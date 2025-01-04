package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// 메모리 회원 저장소 (실제 운영될 DB가 아닌 메모리에 저장되는 로컬 & 테스트 용 저장공간)
public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
