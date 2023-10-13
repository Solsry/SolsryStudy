package solsry.java.chapter01.part01;

public class MovieTest {
    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.mtitle = "Solsry's Study";
        mv.mday = "2023.09.25";
        mv.major = "박진솔";
        mv.mpart = "드라마";
        mv.mtime = 300;

        System.out.println(mv.mtitle + "\n" + mv.mday + "\n" + mv.mpart + "\n" + mv.major + "\n");
        System.out.println("solsry.java.chapter01.part01.Movie Title = " + mv.mtitle);
    }
}
