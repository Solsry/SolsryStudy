package solsry.java.chapter01.part01;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String day = "Tuesday"; // 요일을 넣어 확인하기
        switch (day){
            case "Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday" :
                System.out.println("농구하기");
                break;
            case "Tuesday" :
            case "Wednesday" :
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
