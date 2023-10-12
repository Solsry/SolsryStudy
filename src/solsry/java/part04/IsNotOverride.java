package solsry.java.part04;

import solsry.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 아직 안 했기 때문에 -> 부모가 명령을 내리면 오동작을 한다.
        // [다형성을 보장하지 않았다.] -> 다형성을 보장하려면? -> 재정의를 강제로 하도록 만들어 주면 된다.
        // 그래서 추상클래스와 인터페이스의 개념이 등장한다.
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
