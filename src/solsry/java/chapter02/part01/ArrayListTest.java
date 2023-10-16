package solsry.java.chapter02.part01;

import solsry.java.chapter02.model02.BookDTO;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하기
        // BookDTO[], Object[]
        ArrayList list = new ArrayList(1); // 기본크기(10)
        list.add(new BookDTO("자바", 15000, "한빛", "홍길동"));
        list.add(new BookDTO("Python", 20000, "dd", "tt"));
        list.add(new BookDTO("AWS", 30000, "ss", "yy"));

        BookDTO dto = (BookDTO)list.get(0); // BookDTO <--- (BookDTO)Object
        System.out.println(dto.toString());

        dto = (BookDTO)list.get(1); // BookDTO <--- (BookDTO)Object
        System.out.println(dto.toString());

        dto = (BookDTO)list.get(2); // BookDTO <--- (BookDTO)Object
        System.out.println(dto.toString());

        for (int i = 0; i < list.size(); i++) { // Object -> BookDTO(JVM에서 자동으로 BookDTO의 toString())
            System.out.println(list.get(i));
        }
    }
}
