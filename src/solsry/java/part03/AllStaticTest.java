package solsry.java.part03;

import solsry.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic st = new AllStatic();
//        System.out.println(st.hap(10,20));
//        System.out.println(st.max(10,15));
//        System.out.println(st.min(10,40));
        System.out.println(AllStatic.hap(10,20));
        System.out.println(AllStatic.max(10,15));
        System.out.println(AllStatic.min(10,40));

        // Math m = new Math(); // private
        System.out.println(Math.max(30,60));
    }
}
