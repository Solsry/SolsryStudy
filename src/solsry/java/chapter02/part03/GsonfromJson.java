package solsry.java.chapter02.part03;

import com.google.gson.Gson;
import solsry.java.chapter02.model03.Member;

public class GsonfromJson {
    public static void main(String[] args) {
        String json="{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\"}";
        // JSON -> Object(Member)
        Gson gson=new Gson();
        Member mvo=gson.fromJson(json, Member.class);
        System.out.println("mvo = " + mvo); // mvo.toString() : Member{name='홍길동', age=30, email='bit@empas.com'}
    }
}
