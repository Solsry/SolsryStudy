package solsry.java.chapter01.part02;

import solsry.java.chapter01.model.CarDTO;
import solsry.java.chapter01.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스 설계
        int carSn = 1110;
        String carName = "bmw";
        int carPrice = 100000;
        String carType = "G";
        int carYear = 2023;
        String carOwner = "solsry";
        // 데이터를 하나로 묶는다(이동)
        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carYear=carYear;
        car.carPrice=carPrice;
        car.carType=carType;
        car.carOwner=carOwner;
        car.carName=carName;
        // carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }
}
