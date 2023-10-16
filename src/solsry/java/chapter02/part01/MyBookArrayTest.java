package solsry.java.chapter02.part01;

import solsry.java.chapter01.poly.B;
import solsry.java.chapter02.model02.BookArray;
import solsry.java.chapter02.model02.BookDTO;

public class MyBookArrayTest {
    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력
        BookArray list = new BookArray(); // 책, 길이 5
        list.add(new BookDTO("자바",15000,"한빛","홍길동"));
        list.add(new BookDTO("Python",20000,"dd","tt"));
        list.add(new BookDTO("AWS",30000,"ss","yy"));

        // BookDTO dto = list.get(0);
        System.out.println(list.get(0)); // BookDTO{title='자바', price=15000, company='한빛', author='홍길동'}

        // dto = list.get(1);
        System.out.println(list.get(1));

        // dto = list.get(2);
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
