package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        // Object dog = new Dog();
        // Object car = new Car(); 가능
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // Object는 이미 최상위 부모이기 때문에 메서드를 찾으러 올라갈 부모가 없다
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        //obj.move(); //컴파일 오류, Object는 move()가 없다.

        //객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
