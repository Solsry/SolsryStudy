package solsry.java.chapter02.part02;

import solsry.java.chapter02.model02.Converter;
import solsry.java.chapter02.model02.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        // 정적 메소드 참조
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123"); // Auto-unboxing
        System.out.println("result = " + result); // 123
    }
}
