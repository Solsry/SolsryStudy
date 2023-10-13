package solsry.java.chapter01.part01;

public class CallByReference {
    public static void main(String[] args) {
        float a = 12.3f;
        float b = 78.9f;
        floatAdd(a,b);
        System.out.println("종료");
    }
    // CallByValue - 매개변수로 2개의 실수를 받아 총합을 구하여 출력하는 메서드를 정의하기
    public static void floatAdd(float a , float b){
        float bap = a+b;
        System.out.println("bap = " + bap);
        return; //리턴문이 없기 때문에 void 사용
    }
}
