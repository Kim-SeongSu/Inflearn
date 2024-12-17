package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    // 코드 작성
    public void printAll() {
    }


    public void add(Product product, int quantity) {
        cartMap.computeIfAbsent(product,)
    }

    public void minus(Product product, int quantity) {
    }
}
