public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 1 ; i<=10 ; i++){
            System.out.println(i);
        }

        for (char c = 'A'; c<='Z'; c++){
            System.out.println(c+":"+(int)c);
        }

        for (char c = 'a'; c<='z'; c++){
            System.out.println(c+":"+(int)c);
        }

        for (int i = 65; i<=90; i++){
            System.out.println((char)i+":"+i);
        }

        // Q. int[] numbers={1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // foreach문
        for (int su : numbers){
            System.out.println(su);
        }
    }
}
