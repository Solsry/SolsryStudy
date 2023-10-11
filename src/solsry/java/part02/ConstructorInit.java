package solsry.java.part02;

import solsry.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하기
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());

        // 개발자가 원하는 값으로 초기화를 하는 방법
    }
}
