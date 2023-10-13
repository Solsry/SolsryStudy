package solsry.java.chapter01.poly;

public class Dog extends Animal { // 아직은 Animal -> eat(){ ? }이 된다.
  // 재정의를 하지 않음(x)

    @Override
    public void eat() {
        System.out.println("개 처럼 먹다.");
    }
}
