package solsry.java.chapter02.part01;

import solsry.java.chapter02.model02.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,7};

        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
