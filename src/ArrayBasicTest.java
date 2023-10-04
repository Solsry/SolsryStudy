public class ArrayBasicTest {
    public static void main(String[] args) {
        // Q. [정수 3개]를 저장 할 [변수를 선언]하고 모두 10을 저장하라
        int a,b,c;
        a = 10;
        b = 10;
        c = 10;
        
        int sum = a+b+c;
        System.out.println("sum = " + sum);
        // 데이터의 수가 만약 늘어나게 된다면?
        // ex) int a,b,c,d,e,f,g,h ---
        // ex) int sum = a+b+c ---  데이터 처리가 복잡해지게 된다.
    }
}
