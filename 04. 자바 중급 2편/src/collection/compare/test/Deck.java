package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 새로운 덱 생성, 섞기, 뽑기
public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffleCard();
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit icon : Suit.values()) {
                cards.add(new Card(i, icon));
            }
        }
    }

    private void shuffleCard() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }


}
