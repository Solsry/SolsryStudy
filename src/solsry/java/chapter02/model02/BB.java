package solsry.java.chapter02.model02;
// BB는 노출이 되지 않는 클래스
public class BB implements CC{
    @Override
    public void x() {
        System.out.println("x 동작이 실행된다.");
    }
    @Override
    public void y() {
        System.out.println("y 동작이 실행된다.");
    }
    @Override
    public void z() {
        System.out.println("z 동작이 실행된다.");
    }
}
