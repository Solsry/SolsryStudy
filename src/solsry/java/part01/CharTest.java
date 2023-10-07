package solsry.java.part01;

public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c);

        int a = 'a';
        System.out.println("a = " + a);

        int A = 'A';
        System.out.println("A = " + A);

        int b = 'B'+1;
        System.out.println("b = " + b);

        int zero = '0';
        System.out.println("zero = " + zero);

        char han = '가';
        System.out.println("han = " + han);

        int hanD = '가';
        System.out.println("hanD = " + hanD);

        int hanUni = '\uAC00';
        System.out.println("hanUni = " + (char)hanUni);

        char upper = 'A';
        char lower = (char)(upper+32);
        System.out.println("lower = " + lower);

        char lower1 = 'u';
        int upper1 = lower1-32;
        System.out.println("upper1 = " + upper1);
        System.out.println("upper1 = " + (char)upper1);

        // '1' + '2' = 3
        int date = '1' + '2';
        System.out.println("date = " + date);
        // '0'=48
        char i = '1'; // 49-48=1
        char j = '2'; // 50-48=2
        int sum = (i-48)+(j-48);
        System.out.println("sum = " + sum);

        char aa = '1';
        char bb = '2';
        char cc = '3';
        char dd = '4';
        char ee = '5';
        int sumsum = (aa-48)+(bb-48)+(cc-48)+(dd-48)+(ee-48);
        System.out.println("sumsum = " + sumsum);

        int oo = 0;
        oo = oo + ('1'-'0');
        oo = oo + ('2'-'0');
        oo = oo + ('3'-'0');
        oo = oo + ('4'-'0');
        oo = oo + ('5'-'0');
        System.out.print("oo = " + oo);


    }
}
