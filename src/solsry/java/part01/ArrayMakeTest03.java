package solsry.java.part01;

public class ArrayMakeTest03 {
    public static void main(String[] args) {
        // Q. 실수 5개를 저장 할 [배열을 생성]하고 모든 원소에 10을 저장하고 출력하기
        float[] f = new float[5];
        f[0] = 10.5f;
        f[1] = 20.5f;
        f[2] = 30.5f;
        f[3] = 40.5f;
        f[4] = 50.5f;
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }

        // Q. 정수 5개를 [배열에 초기화]하고 index 0번째와 index 3번째 값을 더하여 출력하기
        int[] a = {10,20,30,40,50};
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        int sum = a[0] + a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);

        int[] b = new int[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        float[] c = new float[3];
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
    }
}
