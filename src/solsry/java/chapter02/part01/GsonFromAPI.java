package solsry.java.chapter02.part01;

import com.google.gson.Gson;
import solsry.java.chapter02.model02.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"Solsry\",\"age\":26}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());
    }
}
