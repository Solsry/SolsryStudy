package solsry.java.part01;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        // Q. 2행 4열의 [정수형] 배열을 생성하기
        int[][] a = new int[2][4];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;

        a[1][0]=50;
        a[1][1]=60;
        a[1][2]=70;
        a[1][3]=80;

        // System.out.println(a[0][0]+"\n"+a[0][1]+"\n"+a[0][2]+"\n"+a[0][3]);
        // System.out.println(a[1][0]+"\n"+a[1][1]+"\n"+a[1][2]+"\n"+a[1][3]);

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
