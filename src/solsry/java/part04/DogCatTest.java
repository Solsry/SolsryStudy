package solsry.java.part04;

import solsry.java.model.Cat;
import solsry.java.model.Dog;

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
