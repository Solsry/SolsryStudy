package solsry.java.part01;

public class ArrayExam03 {
    public static void main(String[] args) {
        // Q. 영화 3편을 저장 할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하기
        Movie[] m = new Movie[3];
        m[0]=new Movie();
        m[0].mtitle="A solsry.java.part01.Movie";
        m[0].mtime=120;
        m[0].major="drama";

        m[1]=new Movie();
        m[1].mtitle="B solsry.java.part01.Movie";
        m[1].mtime=110;
        m[1].major="action";

        m[2]=new Movie();
        m[2].mtitle="C solsry.java.part01.Movie";
        m[2].mtime=100;
        m[2].major="SF";

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].mtitle+"\n"+m[i].major+"\n"+m[i].mtime);
        }
    }
}
