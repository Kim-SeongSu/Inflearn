/*
문제7 - 장바구니
문제 설명
    장바구니 추가 - add()
        장바구니에 상품과 수량을 담는다. 상품의 이름과 가격이 같으면 같은 상품이다.
        장바구니에 이름과 가격이 같은 상품을 추가하면 기존에 담긴 상품에 수량만 추가된다.
        장바구니에 이름과 가격이 다른 상품을 추가하면 새로운 상품이 추가된다.
    장바구니 제거 - minus()
        장바구니에 담긴 상품의 수량을 줄일 수 있다. 만약 수량이 0보다 작다면 상품이 장바구니에서 제거된다.
CartMain 과 실행 결과를 참고해서 Product , Cart 클래스를 완성하자.
Cart 클래스는 Map 을 통해 상품을 장바구니에 보관한다.
    Map 의 Key는 Product 가 사용되고, Value는 장바구니에 담은 수량이 사용된다
 */

package collection.map.test.cart;

public class Product {
    private String name;
    private int price;

    // 코드 작성
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
