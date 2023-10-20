package solsry.java.chapter02.part01;

import solsry.java.chapter02.model02.*;

import java.lang.*;
import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("괴물","봉준호","2006", "한국"));
        list.add(new Movie("기생충","봉준호","2019", "한국"));
        list.add(new Movie("완벽한 타인","이재규","2018", "한국"));

        for (Movie m : list){
            System.out.println(m);
        }

        System.out.println("+----------------+--------+-------+------+");
        System.out.println("+영화제목         |감독     |개봉년도|국가   |");
        System.out.println("+----------------+--------+-------+------+");
        for(Movie m : list){
            System.out.printf("|%-14s|%-8s|%4s|%-6s|\n",m.getMtitle(),m.getDirector(),m.getYear(),m.getCountry());
        }
        System.out.println("+----------------+--------+-------+------+");

        String searchTitle = "기생충";
        // 순차검색->이진검색(*)
        for(Movie m : list){
            if(m.getMtitle().equals(searchTitle)){
                System.out.println("제목:"+m.getMtitle());
                System.out.println("감독:"+m.getDirector());
                System.out.println("개봉년도:"+m.getYear());
                System.out.println("국가:"+m.getCountry());
                break;
            }
        }
    }
}
