public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        // 아래의 add라는 메서드를 호출(call)하여 두 수의 합의 결과 받기.
        int result = add(3,5);
        System.out.println("result = " + result);
    }
    // Q. [매개변수로 2개의 정수를 받아] [총합을 구하여] [리턴]하는 [메서드를 정의]하기.
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
