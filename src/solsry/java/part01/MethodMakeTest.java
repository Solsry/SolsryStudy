package solsry.java.part01;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int result = add(a,b);
        System.out.println("result = " + result);
    }
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
