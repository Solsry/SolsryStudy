package solsry.java.part02;

import solsry.java.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        // Q. 정수 6개를 저장할 배열을 생성
        int [] arr = new int[6];
        arr[0] = 77;
        arr[1] = 66;
        arr[2] = 55;
        arr[3] = 44;
        arr[4] = 33;
        arr[5] = 22;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // Q. Student 객체를 설계하고 데이터 저장 후 출력
        StudentVO std = new StudentVO("박진솔", "ㅇㅇ", 10, "@nvaer.com",2023,"010-2222-2222");
        System.out.println(std);
    }
}
