package oop.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        rectangle.calculaterArea();
        rectangle.calculaterPerimeter();
        rectangle.isSquare();
    }
}
