package solsry.java.part02;

import solsry.java.model.MovieVO;

public class BestVoModeling {
    public static void main(String[] args) {
        MovieVO vo = new MovieVO("아바타",20221214,"제이크 셜리","action",192.0f,12);
        System.out.println(vo.toString());
        System.out.println(vo);
    }

}
