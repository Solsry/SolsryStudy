package solsry.java.part03;

import solsry.java.model.MyUtil02;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10, b = 20;
        MyUtil02 my = new MyUtil02();
        int sum = my.hap(a,b);
        System.out.println(sum);
    }
}
