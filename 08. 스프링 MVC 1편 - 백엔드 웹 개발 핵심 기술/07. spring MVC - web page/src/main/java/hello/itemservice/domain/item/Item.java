package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// @Getter, @Setter 등등 @Data로 대체 (단, 실무에서는 위험성 때문에 @Getter @Setter 처럼 지정해서 사용하길 권장)

//@Data
@Getter @Setter
public class Item {

    // Item - 상품 객체
    private Long id;
    private String itemName;
    private Integer price;      // null 값이 사용될 수 있기 때문에 int 대신 Integer 사용
    private Integer quantity;

    // 생성자 생성
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
