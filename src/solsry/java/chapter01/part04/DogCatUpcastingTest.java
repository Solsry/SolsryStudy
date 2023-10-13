package solsry.java.chapter01.part04;

import solsry.java.chapter01.poly.Animal;
import solsry.java.chapter01.poly.Cat;
import solsry.java.chapter01.poly.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog객체를 사용하려면
        // Dog d = new Dog();
        // d.eat();
        // Upcasting을 하면 부모가 자식을 가르킨다.
        Animal ani = new Dog();
        ani.eat(); //

        ani = new Cat();
        ani.eat();
    }
}
