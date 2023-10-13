package solsry.java.chapter01.part02;

import solsry.java.chapter01.model.CarDAO;
import solsry.java.chapter01.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로 부터 이력을 받아서 DB에 저장하기. (JDBC)
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련 번호 : ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = scan.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = scan.nextLine();

        System.out.print("자동차 연식 : ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입 : "); // G:휘발유 , D:경유
        String carType = scan.nextLine();

        // System.out.println(carName + "\t" + carSn + "\t" + carOwner + "\t" + carType +
        // "\t" + carPrice + "\t" + carYear );
        // 자동차 데이터를 이동하기 위한 바구니가 필요하다. (DTO, VO)
        // class 클래스로 CarDto, CarVO를 설계하면 된다.
        // carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carOwner=carOwner;
        car.carType=carType;
        car.carPrice=carPrice;
        car.carYear=carYear;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect(car);
    }
}
