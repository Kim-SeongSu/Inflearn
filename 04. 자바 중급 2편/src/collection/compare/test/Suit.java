package collection.compare.test;

// 사용하는 아이콘 지정, 출력
public enum Suit {
    SPADE("\u2660"),    // ♠
    HEART("\u2665"),    // ♥
    DIAMOND("\u2666"),  // ◆
    CLOVER("\u2663");   // ♣

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
