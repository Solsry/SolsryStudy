package solsry.java.part01;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int a = 10;
        if (a>=0){
            System.out.println("0 or 양수입니다.");
        }else {
            System.out.println("음수입니다.");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int su = scan.nextInt();
        if(su%2==0){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }

        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        if(num%12==0){
            System.out.println("12의 배수입니다.");
        }else {
            System.out.println("12의 배수가 아닙니다.");
        }

        System.out.print("연도를 입력하세요 : ");
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }
}
