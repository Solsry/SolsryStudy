package solsry.java.chapter01.part02;

import solsry.java.chapter01.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        StudentVO[] std = new StudentVO[3];
        std[0] = new StudentVO("박진솔","중국어",26,"--@naver.com",20231011,"010-1111-1111");
        std[1] = new StudentVO("dd","ff",26,"--@ww.com",14141414,"010-222-222");
        std[2] = new StudentVO("ss","tt",26,"--@ww.com",1234123,"010-333-333");
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }
        for(StudentVO st : std){
            System.out.println(st.toString());
        }
    }
}
