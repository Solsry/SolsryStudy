package solsry.java.chapter01.part03;

import solsry.java.chapter01.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1; // st1 - Object를 나타냄
        StudentVO st2; // st2 - Object를 나타냄
        StudentVO st3; // st3 - Object를 나타냄

        st1 = new StudentVO("박진솔","영어중국어과",26,"@naver.com",20231011,"010-1111-1111"); // st1 - Instance를 나타냄
        st2 = new StudentVO("솔솔","영어중국어과",26,"@naver.com",20231011,"010-1111-1111"); // st2 - Instance를 나타냄
        st3 = new StudentVO("solsry","영어중국어과",26,"@naver.com",20231011,"010-1111-1111"); // st3 - Instance를 나타냄

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
