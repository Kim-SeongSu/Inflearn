/*
문제 - 리스트를 사용한 쇼핑 카트
    ShoppingCartMain 코드가 작동하도록 ShoppingCart 클래스를 완성해라.
    ShoppingCart 는 내부에 리스트를 사용해야 한다
 */

package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
public class ShoppingCart {
    int index = 0;
    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<Integer> totalPrice = new ArrayList<>();

    public void addItem(Item item) {
        itemName.add(item.getName());
        totalPrice.add(item.getTotalPrice());
        index++;
    }

    public void displayItems() {
        int totalSum = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < index; i++) {
            System.out.printf("상품명:%s, 합계:%d\n",itemName.get(i),totalPrice.get(i));
            totalSum += (Integer) totalPrice.get(i);
        }
        System.out.printf("전체 가격 합:%s", totalSum);
    }
}
 */

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        int totalSum = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.printf("상품명:%s, 합계:%d\n",item.getName(),item.getTotalPrice());
            totalSum += (Integer) item.getTotalPrice();
        }
        System.out.printf("전체 가격 합:%s", totalSum);
    }
}