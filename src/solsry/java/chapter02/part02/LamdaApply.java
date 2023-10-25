package solsry.java.chapter02.part02;

import solsry.java.chapter02.model02.StringOperation;

public class LamdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lamda Expressions";
        System.out.println(processString(input, toUpperCase)); // 대문자
        System.out.println(processString(input, toLowerCase)); // 소문자
    }

    public static String processString(String input, StringOperation operation){
        return operation.apply(input);
    }
}
