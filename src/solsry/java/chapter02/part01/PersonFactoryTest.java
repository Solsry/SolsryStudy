package solsry.java.chapter02.part01;

import com.google.gson.internal.bind.util.ISO8601Utils;
import solsry.java.chapter02.model02.Person;
import solsry.java.chapter02.model02.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        /*PersonFactory personFactory= Person::new;
        Person person=personFactory.create("홍길동", 40);
        System.out.println(person);*/
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person = personFactory.create("박진솔", 26);
        System.out.println(person);
    }
}
