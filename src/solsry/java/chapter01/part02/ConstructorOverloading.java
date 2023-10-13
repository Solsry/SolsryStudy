package solsry.java.chapter01.part02;

import solsry.java.chapter01.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해서 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 출력하기
        PersonVO vo = new PersonVO("박화영", 50, "010-3333-3333");
        PersonVO vo1 = new PersonVO("박진솔", 60, "010-2222-2222");
        PersonVO vo2 = new PersonVO("김성경", 25, "010-1111-1111");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());
        System.out.println(vo2.getName()+"\t"+vo2.getAge()+"\t"+vo2.getPhone());
    }
}
