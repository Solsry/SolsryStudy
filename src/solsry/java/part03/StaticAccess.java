package solsry.java.part03;

import solsry.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = MyUtil.hap(a,b);
        System.out.println("sum = " + sum);
    }
}
