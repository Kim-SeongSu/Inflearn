/*
# 문제와 풀이
문제: 상품 주문 시스템 개발 - 사용자 입력
문제 설명
앞서 만든 상품 주문 시스템을 사용자 입력을 받도록 개선해보자.

요구 사항
- 아래 입력, 출력 예시를 참고해서 다음 사항을 적용하자.
- 주문 수량을 입력 받자
    예) 입력할 주문의 개수를 입력하세요:
- 가격, 수량, 상품명을 입력 받자
    입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요." 라는 메시지를 출력하세요.
- 입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자.
 */

package ref.ex;

import java.util.*;
// import java.io.*;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        // int N = Integer.parseInt(br.readLine());
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i=0; i<n; i++) {
            System.out.printf("%d번째 주문 정보를 입력하세요.\n",i+1);
            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

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