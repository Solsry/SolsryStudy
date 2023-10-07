package solsry.java.part01;

public class ArrayExam02 {
    public static void main(String[] args) {
        // 정수 1개를 저장할 변수를 선언하기
        int a;
        a = 10;
        System.out.println("a = " + a);

        // 정수 3개를 저장할 변수를 선언하기
        int[] b = new int[3];
        b[0]=10;
        b[1]=20;
        b[2]=30;

        int[] x = {1,2,3,4,5}; // 배열의 초기화
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

        // 아래 char[] 배열에 대문자로 된 APPLE를 소문자 apple로 변환하여 출력하기
        char[] c = {'A','P','P','L','E'};

        for(int i = 0; i < c.length; i++){
            System.out.print((char)(c[i]+32));
        }
    }
}
