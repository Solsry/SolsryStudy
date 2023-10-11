package solsry.java.model;

public class CarDAO {
    // CRUD
    public void carInsert(CarDTO car){
        //DB연결, insert SQL
        System.out.println("car 정보가 DB에 저장이 되었습니다.");
    }
    public void carSelect(CarDTO car){
        // DB연결, select SQL
        System.out.println("car 정보가 DB에 출력이 되었습니다.");
    }
}
