package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

// 플레이어 정보 (이름, 플레이어 카드, 플레이어 점수)
public class Player {
    private String name;
    private List<Card> cards; // 틀린 부분

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        cards.add(deck.drawCard());
    }

    public int score() {
        int score = 0;
        for (Card card : cards) {
            score += card.getNum();
        }
        return score;
    }

    public void showCard() {
        cards.sort(null);   // 틀린 부분
        System.out.printf("%s의 카드: %s, 합계: %d\n", name, cards, score());
    }

    public String getName() {
        return name;
    }
}
