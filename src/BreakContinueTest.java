public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c = {'s','h','u','t','d','o','w','n'};
        for (int i=0; i<c.length; i++) {
            if(c[i]=='o') {
                break;
            }
            System.out.print(c[i]);
        }
        System.out.println();

        int count = 0;
        for(int i=1; i<=10; i++){
            if(i%3!=0) continue;
                count++;
        }
        System.out.println(count);

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10까지 정수의 총 합 : " + sum);
    }
}
