public class AssignOperTest {
    public static void main(String[] args) {
        // 복합 대입 연산자
        // 1씩 증가하는 수식
        int a = 1;
        a++;
        ++a;
        a=a+1;
        a+=1;
        System.out.println(a);

        // 1씩 감소하는 수식
        int b = 7;
        b--;
        --b;
        b=b-1;
        b-=1;
        System.out.println(b);
    }
}
