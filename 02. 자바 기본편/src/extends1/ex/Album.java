package extends1.ex;

/*
public class Album extends Item{
    public String artist;

    public Album(String name, int price, String artist) {
        super.name = name;
        super.price = price;
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print(name,price);
        System.out.printf("- 아티스트:%s\n", artist);
    }
}
 */
public class Album extends Item{
    private String artist;

    public Album(String name, int price, String artist) {
        super(name,price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("- 아티스트:%s\n", artist);
    }
}
