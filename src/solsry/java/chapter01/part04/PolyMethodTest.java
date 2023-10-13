package solsry.java.chapter01.part04;

import solsry.java.chapter01.poly.Animal;
import solsry.java.chapter01.poly.Cat;
import solsry.java.chapter01.poly.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    public static void display(Animal ani){ // 1. 다형성 인수
        ani.eat();
        // Cat 타입으로 받은 경우에만 실행
        // ((Cat)ani).night();
        if(ani instanceof Cat){
            ((Cat)ani).night();
        }
    }
}
