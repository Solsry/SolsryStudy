package solsry.java.chapter01.part04;

import solsry.java.chapter01.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다.");
        System.out.println(b.getTitle());
        System.out.println(b.toString()); // Board라는 클래스가 solsry.java.chapter01.poly.Board@7a79be86에 있다.
        System.out.println(b); // solsry.java.chapter01.poly.Board@7a79be86 -> 게시글 입니다. 를 띄우려면

    }
}
