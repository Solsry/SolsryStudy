package solsry.java.chapter01.poly;

public class Tv implements RemoCon{

    private int currch=10;

    // chUp(), chDown(), volUp(), volDown()
    @Override
    public void chUp() {
        currch++;
//        if (){
//
//        }

        System.out.println("TV의 채널이 올라간다");
    }
    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려간다");
    }
    @Override
    public void volUp() {
        System.out.println("TV의 소리가 올라간다");
    }
    @Override
    public void volDown() {
        System.out.println("TV의 소리가 올라간다");
    }

    @Override
    public void internet() {
        System.out.println("인터넷이 실행 된다.");
    }
}
