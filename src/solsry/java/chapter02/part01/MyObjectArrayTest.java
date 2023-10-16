package solsry.java.chapter02.part01;

import solsry.java.chapter02.model02.A;
import solsry.java.chapter02.model02.B;
import solsry.java.chapter02.model02.C;
import solsry.java.chapter02.model02.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        // A, B, C 객체를 배열(Object[])에 저장하고 출력하기
        // Book, Movie, Memver 객체를 배열(Object[])에 저장하고 출력
        ObjectArray list = new ObjectArray();
        list.add(new A()); // Upcasting -> 메모리에 Object element = new A();
        list.add(new B());
        list.add(new C());

        A a = (A)list.get(0); // A <= Object
        a.display();

        B b = (B)list.get(1); // A <= Object
        b.display();

        C c = (C)list.get(2); // A <= Object
        c.display();

        // 반복문으로 쓴다면?
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof A){
                ((A)list.get(i)).display();
            } else if (list.get(i) instanceof B) {
                ((B)list.get(i)).display();
            } else {
                ((C)list.get(i)).display();
            }
        }
    }
}
