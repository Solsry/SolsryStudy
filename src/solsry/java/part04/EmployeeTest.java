package solsry.java.part04;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반 사원 한 명의 객체를 생성하고 데이터를 저장 후 출력.
        RempVO vo = new RempVO("박박박", 33, "010-0000-0000","2023-10-11","홍보부",true);
        // 출력
        System.out.println(vo.toString());
    }
}
