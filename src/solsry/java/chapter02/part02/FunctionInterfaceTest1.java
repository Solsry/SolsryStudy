package solsry.java.chapter02.part02;

import solsry.java.chapter02.model02.MathOperation;
import solsry.java.chapter02.model02.MathOperationImpl;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10,20);
        System.out.println("result = " + result);
    }
}
