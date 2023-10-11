package solsry.java.part02;

import solsry.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("박진솔", 26, "010-1111-1111");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo.toString());
        System.out.println(vo); // vo.toString
    }
}
