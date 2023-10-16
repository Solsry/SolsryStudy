package solsry.java.chapter02.part01;

import solsry.java.chapter02.model02.BookDTO;

import java.util.*;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하기
        // BookDTO[], Object[]
        // 기본크기(10) : Object[] -> <>제네릭을 사용하면 제한할 수 있다.
        ArrayList<BookDTO> list = new ArrayList<BookDTO>();

        list.add(new BookDTO("자바", 15000, "한빛", "홍길동"));
        list.add(new BookDTO("Python", 20000, "dd", "tt"));
        list.add(new BookDTO("AWS", 30000, "ss", "yy"));

        BookDTO dto = list.get(0); // BookDTO <--- BookDTO
        System.out.println(dto.toString());

        dto = list.get(1); // BookDTO <--- BookDTO
        System.out.println(dto.toString());

        dto = list.get(2); // BookDTO <--- BookDTO
        System.out.println(dto.toString());

        for (int i = 0; i < list.size(); i++) { // Object -> BookDTO(JVM에서 자동으로 BookDTO의 toString())
            System.out.println(list.get(i));
        }
    }
}
