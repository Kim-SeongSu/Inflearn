/*
카드게임 만들기

요구사항
카드( Card )는 1 ~ 13까지있다. 각 번호당 다음 4개의 문양이 있다.
    ♠: 스페이드
    ♥: 하트
    䡫: 다이아
    ♣: 클로버
예) 1(♠), 1(♥), 1(䡫), 1(♣), 2(♠), 2(♥), 2(䡫), 2(♣) ... 13(♠), 13(♥), 13(䡫), 13(♣) 따라서 13 * 4 = 총 52장의 카드가 있다.
52장의 카드가 있는 카드 뭉치를 덱( Deck )이라 한다.
2명의 플레이어( Player )가 게임을 진행한다.

게임을 시작하면 다음 순서를 따른다.
    1. 덱에 있는 카드를 랜덤하게 섞는다.
    2. 각 플레이어는 덱에서 카드를 5장씩 뽑는다.
    3. 각 플레이어는 5장의 카드를 정렬된 순서대로 보여준다. 정렬 기준은 다음과 같다.
        작은 숫자가 먼저 나온다.
        같은 숫자의 경우 ♠, ♥, 䡫, ♣ 순으로 정렬한다. ♠가 가장 먼저 나온다.
        예) 1(♠), 1(♥), 2(䡫), 3(♣) 순서로 출력된다.
    4. 카드 숫자의 합계가 큰 플레이어가 승리한다.
        게임을 단순화 하기 위해 숫자만 출력한다.
        합계가 같으면 무승부이다.
 */

package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        // 카드 분배
        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        // 카드 출력
        player1.showCard();
        player2.showCard();

        // 우승자 출력
        Player winner = winner(player1,player2);
        if(winner(player1,player2) != null ) System.out.printf("%s 승리\n",winner.getName());
        else System.out.println("무승부");
    }

    public static Player winner(Player p1, Player p2) {
        return p1.score() > p2.score() ? p1 : (p1.score() == p2.score() ? null : p2);
    }
}
