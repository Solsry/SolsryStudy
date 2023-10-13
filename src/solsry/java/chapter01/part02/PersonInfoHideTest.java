package solsry.java.chapter01.part02;

import solsry.java.chapter01.model.PersonVO;

public class PersonInfoHideTest {
    public static void main(String[] args) {
        // Q. 한 사람의 [회원] 정보를 저장할 [객체를 생성하기(인스턴스 만들기)]
        PersonVO vo = new PersonVO();
        vo.setName("solsry");
        vo.setAge(111);
        vo.setPhone("010-0000-1111");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
    }
}
