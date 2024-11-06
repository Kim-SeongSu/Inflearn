package poly.ex3;

public abstract class Animal {
    public abstract void sound();  // " { System.out.println("동물 울음 소리") } " 같은메서드 바디를 만들 필요 없다.


    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
