package solsry.java.chapter01.part04;

import solsry.java.chapter01.poly.Cat;
import solsry.java.chapter01.poly.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        // Dog 객체를 생성하고 eat()동작을 구동
        Dog d = new Dog();
        d.eat();

        // Cat 객체를 생성하고 eat(), night()동작을 구동
        Cat c = new Cat();
        c.eat();
        c.night();
    }
}
