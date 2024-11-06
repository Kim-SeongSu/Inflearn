package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();    // Animal dog = new Dog() 도 가능
        Cat cat = new Cat();    // Animal cat = new Cat() 도 가능
        Cow cow = new Cow();    // Animal cow = new Cow() 도 가능
        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
