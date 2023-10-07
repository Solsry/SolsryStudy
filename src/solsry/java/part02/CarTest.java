package solsry.java.part02;

import solsry.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 [키보드로 부터 입력] 받아서 [다른 메서드]로 이동해야 하는 경우
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
        carInfoPrint(car);
    }
    // Q. 매개변수로 자동차의 정보를 받아서 / 출력하는 / 메서드를 정의하기.
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carName + "\t" + car.carSn + "\t" + car.carOwner
                + "\t" + car.carType + "\t" + car.carPrice + "\t" + car.carYear );
    }

//    public static void carInfoPrint(int carSn, String carName, int carPrice, String carOwner,
//    int carYear, String carType){
//        System.out.println(carName + "\t" + carSn + "\t" + carOwner + "\t" + carType
//        + "\t" + carPrice + "\t" + carYear );
//    }
}
