package solsry.java.chapter01.part04;

import solsry.java.chapter01.poly.Animal;
import solsry.java.chapter01.poly.Cat;
import solsry.java.chapter01.poly.Dog;

public class PollyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Dog와 Cat을 저장하는 배열 만들기
        // Animal[] ani = {new Dog(), new Cat()}; -> 이렇게 표현해도 됨
        // 2. [다형성 배열]
        Animal[] ani = new Animal[2];
        ani[0]=d;
        ani[1]=c;
        display(ani);
    }
    public static void display(Animal[] ani){
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat(); // ani[0]=Dog, ani[1]=Cat
            // ((Cat)ani).night();
            if ( ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
