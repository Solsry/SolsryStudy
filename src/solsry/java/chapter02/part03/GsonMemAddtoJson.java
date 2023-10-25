package solsry.java.chapter02.part03;

import com.google.gson.Gson;
import solsry.java.chapter02.model03.Address;
import solsry.java.chapter02.model03.Person;

public class GsonMemAddtoJson {
    public static void main(String[] args) {
        Address address = new Address("서올","대한민국");
        Person member=new Person("홍길동", 30, "bit@empas.com", address);

        // Person -> JSON
        Gson gson=new Gson();
        String json=gson.toJson(member);
        System.out.println("json = " + json);
    }
}
