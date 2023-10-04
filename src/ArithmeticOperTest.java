public class ArithmeticOperTest {
    public static void main(String[] args) {
        int a = 3625;
        System.out.println(a%10);
        System.out.println(a/10%10);
        System.out.println(a/100%10);
        System.out.println(a/1000%10);

        int su = 5;
        if(su%2==0){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }

    }
}
