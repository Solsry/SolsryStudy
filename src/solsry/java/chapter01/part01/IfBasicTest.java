package solsry.java.chapter01.part01;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        // Q. x의 값이 0 보다 큰 경우에만 "양수입니다" 출력하기
        int x = 10;
        if (x>0) {
            System.out.println("양수입니다");
        }
        System.out.println("종료");

        // Q. 정수 1개를 입력 받아서 입력된 수가 7의 배수인지 출력하기
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = scan.nextInt();
        if(num%7==0){
            System.out.println("num = " + num + "은 7의 배수가 맞습니다.");
        }
        System.out.println("7의 배수가 아닙니다.");
        // Q. 나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드 작성하기.
        System.out.print("나이 입력 : ");
        int age = scan.nextInt();
        if(age>=19){
            System.out.println("age = " + age + "살은 성인의 나이가 맞습니다.");
        }
        System.out.println("성인이 아닙니다.");
    }
}
