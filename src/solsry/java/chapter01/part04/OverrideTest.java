package solsry.java.chapter01.part04;

import solsry.java.chapter01.poly.Animal;
import solsry.java.chapter01.poly.Cat;
import solsry.java.chapter01.poly.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업케스팅) : Dog.java(x) , Animal <--> Dog.class(o)
        Animal ani = new Dog();
        ani.eat(); // Animal -- (동적 바인딩) --> Dog

        ani = new Cat();
        ani.eat(); // Animal -- (동적 바인딩) --> Cat
    }
}
