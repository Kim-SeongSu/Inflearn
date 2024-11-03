package extends1.ex;
/*
public class Book extends Item{
    public String author, isbn;

    public Book(String name, int price, String author, String isbn) {
        // super(); // 기본 생성자 생략가능
        super.name = name;
        super.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print(name,price);
        System.out.printf("- 저자:%s, isbn:%s\n", author,isbn);
    }
}
 */

public class Book extends Item{
    private String author, isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }


    @Override
    public void print() {
        super.print();
        System.out.printf("- 저자:%s, isbn:%s\n", author,isbn);
    }
}