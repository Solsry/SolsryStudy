package solsry.java.part04;

import solsry.java.poly.Animal;
import solsry.java.poly.Cat;
import solsry.java.poly.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
        // 추상 클래스는 단독으로 객체를 생성할 수 없다.
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        // Downcasting
        ((Cat)ani).night();
    }
}
