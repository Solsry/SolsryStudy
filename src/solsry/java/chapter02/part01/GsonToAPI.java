package solsry.java.chapter02.part01;

import com.google.gson.Gson;
import solsry.java.chapter02.model02.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("Solsry", 26);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
