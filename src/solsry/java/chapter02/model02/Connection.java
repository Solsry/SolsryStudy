package solsry.java.chapter02.model02;
// interface는 자바에서 제공을 한다.
public interface Connection {
    // 데이터 베이스 연결 동작
    public void getConnection(String url, String username, String password);
    // 구현체는 Vender사에서 만든다.
}
