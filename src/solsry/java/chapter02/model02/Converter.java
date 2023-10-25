package solsry.java.chapter02.model02;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}