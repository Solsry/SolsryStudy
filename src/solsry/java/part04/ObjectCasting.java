package solsry.java.part04;

import solsry.java.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat
        // Upcasting
        Animal ani = new Dog();
        ani.eat(); // 동적 바인딩이 일어났기 때문에 "개 처럼 먹다."

        ani = new Cat();
        ani.eat(); // 동적 바인딩이 일어났기 때문에 "고양이 처럼 먹다."
        // ani.night(); // 다운 케스팅을 해야한다.

        //Downcasting 하는 방법
        Cat c = (Cat)ani;
        c.night();
        // 캐스팅 연산자보다 참조(.) 연사자가 먼저 컴파일 되기 때문에 괄호를 알맞게 넣어주어야 한다.
        ((Cat)ani).night();
    }
}
