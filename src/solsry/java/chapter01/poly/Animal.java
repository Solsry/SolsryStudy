package solsry.java.chapter01.poly;

// 추상 클래스 (abstract) -> 불완전한 클래스
public abstract class Animal {
    // public void eat();
    // 추상 메서드( 불완전한 메서드) : 메서드의 구현부(body)가 없다.
    public abstract void eat();

    // 구현 메서드
    public void move(){
        System.out.println("무리를 지어 이동한다.");
    }
}
