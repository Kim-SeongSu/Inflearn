package extends1.ex;
/*
public class Item {
    public String name;
    public int price;

    public void print(){
    }

    public void print(String name, int price) {
        System.out.printf("이름:%s, 가격:%d\n",name,price);
    }

    public int getPrice() {
        return price;
    }
}
 */

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.printf("이름:%s, 가격:%d\n",name,price);
    }
}