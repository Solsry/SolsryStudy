package solsry.java.chapter01.model;

public class CarUtility {
    public void carPrint(CarDTO car){
        System.out.println(car.carName + "\t" + car.carSn + "\t" + car.carOwner
                + "\t" + car.carType + "\t" + car.carPrice + "\t" + car.carYear );
    }
}
