package solsry.java.part04;

import solsry.java.poly.Animal;
import solsry.java.poly.Cat;
import solsry.java.poly.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체를 생성해야 한다.
        // 상속관계, 재정의, 동적바인딩
        // 다형성 이론이 출발을 한다 (Message Polymorphism)
        Animal ani = new Dog();
        ani.eat(); // 실행 시점에서 사용될 메서드가 결정되는 바인딩 -> 동적 바인딩

        ani = new Cat();
        ani.eat();

        //Downcasting
        ((Cat)ani).night();
        // Overloading(오버로딩) : 정적 바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와는 무관하다.
        // Overriding(오버라이딩) : 동적 바인딩 = 실행 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와 관계가 있다.
    }
}
