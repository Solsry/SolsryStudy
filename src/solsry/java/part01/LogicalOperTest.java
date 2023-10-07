package solsry.java.part01;

public class LogicalOperTest {
    public static void main(String[] args) {
        int x = 1, y = 0;
        System.out.println(!(x>0)); //f
        System.out.println(x>0 && x<3); //t
        System.out.println(x>0 && y<0); //f
        System.out.println(x<0 || y>=0); //t
        System.out.println(y<0 && y<-5); //f
        System.out.println();

        int a = 3, b = 5;
        System.out.println((a>=3) && (b<6)); //t
        System.out.println((a!=3) && (a>2)); //f
        System.out.println((a!=3) || (a>2)); //t
        System.out.println((b!=5) || (a==1)); //f
    }
}
