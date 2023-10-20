package solsry.java.chapter02.part01;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        list.set(1,"TTTT");

        for(String str : list){
            System.out.println(str.toString());
        }
    }
}
