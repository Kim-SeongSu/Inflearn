package collection.set.member;

import java.util.Objects;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id,member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);    // hashCode 생성해주는 메서드
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
