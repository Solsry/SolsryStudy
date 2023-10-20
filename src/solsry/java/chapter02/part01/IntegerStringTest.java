package solsry.java.chapter02.part01;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 + str2);
        int num = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(num);

        int su1 = 123;
        int su2 = 123;
        String str = String.valueOf(su1)+String.valueOf(su2);
        System.out.println(str);

        String s1 = ""+su1;
        String s2 = ""+su2;
        String s3 = su1+""+su2;
        System.out.println(s3);
        System.out.println(s1+s2);
    }
}
