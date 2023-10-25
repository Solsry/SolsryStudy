package solsry.java.chapter02.model02;
@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);
}
