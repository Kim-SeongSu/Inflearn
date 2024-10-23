/*
# 문제와 풀이
문제: 상품 주문 시스템 개발 - 리팩토링
문제 설명
앞서 만들었던 다음 클래스에 있는 "상품 주문 시스템"을 리팩토링 하자.

package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

        int totalPrice = 0;
        for (ProductOrder order : orders) {
            System.out.printf("상품명: %s, 가격: %d, 수량: %d\n", order.productName, order.price, order.quantity);
            totalPrice += order.price * order.quantity;
        }
        System.out.printf("총 결제 금액: %d",totalPrice);
    }
}
 */

package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 3);

        printOrder(orders);
        getTotalAmount(orders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.printf("상품명: %s, 가격: %d, 수량: %d\n", order.productName, order.price, order.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        System.out.printf("총 결제 금액: %d",totalAmount);
    }
}