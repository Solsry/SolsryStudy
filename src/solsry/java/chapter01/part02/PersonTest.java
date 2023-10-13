package solsry.java.chapter01.part02;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 변수를 선언
        // Q. 사람의 이름, 나이, 전화번호를 저장할 객체를 생성
        // Q. 생성된 객체를 변수에 할당(대입,저장)하기
        // Q. [인스턴스 생성]
        Person p = new Person();
        p.name = "박진솔";
        p.age = 25;
        p.phone="010-1111-1111";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p.name = "솔소리";
        p.age = 27;
        p.phone="010-2222-2222";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
