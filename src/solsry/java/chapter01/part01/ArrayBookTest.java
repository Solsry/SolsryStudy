package solsry.java.chapter01.part01;

public class ArrayBookTest {
    public static void main(String[] args) {
        // Q. 실수 3개를 저장할 배열을 생성하고 값을 저장하고 출력(기본 배열)
        float[] f = {11.1f,22.2f,33.3f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        Book[] b = new Book[3];
        b[0]=new Book();
        b[0].title="자바";
        b[0].price=3000;
        b[0].company="진솔";
        b[0].page=300;
        //System.out.println(b[0].title+"\n"+b[0].price+"\n"+b[0].page);

        b[1]=new Book();
        b[1].title="오라클";
        b[1].price=1000;
        b[1].company="한솔";
        b[1].page=200;
        //System.out.println(b[1].title+"\n"+b[1].price+"\n"+b[1].page);

        b[2]=new Book();
        b[2].title="AI";
        b[2].price=2333;
        b[2].company="성경";
        b[2].page=100;
        //System.out.println(b[2].title+"\n"+b[2].price+"\n"+b[2].page);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i].title+"\n"+b[i].price+"\n"+b[i].page);
        }
    }
}
