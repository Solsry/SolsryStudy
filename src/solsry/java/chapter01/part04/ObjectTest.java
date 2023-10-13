package solsry.java.chapter01.part04;

import solsry.java.chapter01.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        // A 객체를 Upcasting하기
        A a = new A();
        a.display();

        Object obj = new A();
        // obj.display(); // Downcasting하기
        ((A)obj).display();
    }
}
