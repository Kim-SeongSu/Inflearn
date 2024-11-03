package extends1.ex;

/*
public class Movie extends Item{
    public String director, actor;

    public Movie(String name, int price, String director, String actor) {
        super.name = name;
        super.price = price;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print(name,price);
        System.out.printf("- 감독:%s, 배우:%s\n", director,actor);
    }
}
*/

public class Movie extends Item{
    private String director, actor;

    public Movie(String name, int price, String director, String actor) {
        super(name,price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("- 감독:%s, 배우:%s\n", director,actor);
    }
}