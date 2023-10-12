package solsry.java.part04;

import solsry.java.poly.Radio;
import solsry.java.poly.RemoCon;
import solsry.java.poly.Tv;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보기.
        // 다형성이 100% 보장이 된다.
        // 부모가 인터페이스이면 자식의 내부 동작 방식을 전혀 몰라도 동작을 시킬 수 있다.
        RemoCon re = new Radio();
        // RemoCon r = new RemoCon(); 객체 생성 불가
        // 부모의 역할을 할 수 있다.
        re.chUp();
        re.chDown();
        re.volUp();
        re.volDown();
        re.internet();

        re = new Tv();
        re.chUp();
        re.chDown();
        re.volUp();
        re.volDown();
        re.internet();
    }
}
