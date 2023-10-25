package solsry.java.chapter02.part02;

import solsry.java.chapter02.model02.MathOperation;
import solsry.java.chapter02.model02.MathOperationImpl;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        // MathOperation 인터페이스를 내부 익명 클래스로 구현하기.
        MathOperation mo = new MathOperation(){
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };

        int result = mo.operation(10,20);
        System.out.println("result = " + result);
    }
}
