package collection.compare.test;

// 카드를 비교하는 클래스
public class Card implements Comparable<Card>{
    private final int num;
    private final Suit icon;

    public Card(int num, Suit icon) {
        this.num = num;
        this.icon = icon;
    }

    public int getNum() {
        return num;
    }

    public Suit getIcon() {
        return icon;
    }

    @Override
    public int compareTo(Card o) {
        if (this.num != o.num) {
            return Integer.compare(this.num, o.num);
        } else {
            return this.icon.compareTo(o.getIcon());    // Suit가 ENUM을 (자동적으로) 상속하므로 자체적인 compareTo 갖음
        }                                               // ENUM 타입은 compareTo() 가 열거형의 순서인 ordinal 로 구현
    }

    @Override
    public String toString() {
        return num + "(" + icon.getIcon() + ")";
    }
}
