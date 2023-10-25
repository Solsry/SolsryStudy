package solsry.java.chapter02.part02;

import solsry.java.chapter02.model02.MathOperation;

public class LamdaExample {
    public static void main(String[] args) {
        // 람다식 표현
        // MathOperation add = (int x, int y) -> {return x+y;};
        MathOperation add = (x, y) -> x + y;
        int result = add.operation(10,20);
        System.out.println("result = " + result);

        MathOperation multi = (x,y) -> x * y;
        int result02 = multi.operation(10,20);
        System.out.println("result02 = " + result02);
    }
}
