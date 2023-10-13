package solsry.java.chapter01.part01;

public class CallByReference02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        // 배열의 총 합을 구하여 출력하기
        int result = addArray(a); // 번지 전달(Call by reference)
        System.out.println("result = " + result);
    }
    public static int addArray(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        return sum;
    }
}
