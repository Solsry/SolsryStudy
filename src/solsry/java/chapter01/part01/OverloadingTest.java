package solsry.java.chapter01.part01;

public class OverloadingTest {
    public static void main(String[] args) {
        float v = add(11.1f,22.2f);
        System.out.println("v = " + v);
        int vv = add(10,20);
        System.out.println("vv = " + vv);
    }
    public static   int add(int a , int b){
        int sum = a+b;
        return sum;
    }

    public static float add(float a, float b){
        float sum = a+b;
        return sum;
    }
}
