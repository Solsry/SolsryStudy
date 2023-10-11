package solsry.java.part02;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p = new Person();
        p.name = "solsry";
        p.age = 1000; // ?
        p.phone = "010-9999-9999";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
    }
}
