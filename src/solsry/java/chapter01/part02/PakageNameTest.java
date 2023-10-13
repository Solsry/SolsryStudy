package solsry.java.chapter01.part02;
// impoert java.lang.* // default pakage
import solsry.java.chapter01.model.CarDAO;
import solsry.java.chapter01.model.CarDTO;

import java.util.Scanner;

public class PakageNameTest {
    public static void main(String[] args) {
        // Q. 자바에서 제공해 주어 사용해본 클래스들
        String str = "solsry";
        Scanner scan = new Scanner(System.in);
        System.out.println("solsry");

        System.out.print("이름 : ");
        String name = scan.nextLine();

        CarDTO car = new CarDTO();
        CarDAO carDao = new CarDAO();
    }
}
