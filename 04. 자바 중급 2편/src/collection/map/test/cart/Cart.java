package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    // 코드 작성
    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.printf("상품: %s 수량: %d\n", entry.getKey(), entry.getValue());
        }
    }

    public void add(Product product, int quantity) {
        if (!cartMap.containsKey(product)) cartMap.put(product,quantity);
        else cartMap.put(product,cartMap.get(product)+quantity);
        /*
        // 답안
        int existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addQuantity);
         */
    }

    public void minus(Product product, int quantity) {
        cartMap.put(product,cartMap.get(product)-quantity);
        if (cartMap.get(product)==0) cartMap.remove(product);

        /*
        // 답안
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
         */
    }
}
