package solsry.java.part04;

import solsry.java.model.Animal;
import solsry.java.model.Cat;
import solsry.java.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업케스팅) : Dog.java(x) , Animal <--> Dog.class(o)
        Animal ani = new Dog();
        ani.eat(); // Animal -- (동적 바인딩) --> Dog

        ani = new Cat();
        ani.eat(); // Animal -- (동적 바인딩) --> Cat
    }
}
