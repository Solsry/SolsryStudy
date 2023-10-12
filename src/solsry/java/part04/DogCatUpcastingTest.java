package solsry.java.part04;

import solsry.java.poly.Animal;
import solsry.java.poly.Cat;
import solsry.java.poly.Dog;

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
