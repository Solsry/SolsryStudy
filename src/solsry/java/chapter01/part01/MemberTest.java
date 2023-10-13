package solsry.java.chapter01.part01;

import solsry.java.chapter01.part01.Member.Member;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member() ;
        m.age = 26;
        m.name = "박진솔";
        m.weight = 67.77;
        System.out.println(m.name + "\n" + m.weight + "\n" + m.age);
    }
}
