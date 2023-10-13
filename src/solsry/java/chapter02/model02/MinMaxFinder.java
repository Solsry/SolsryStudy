package solsry.java.chapter02.model02;

public class MinMaxFinder {
    private MinMaxFinder(){} // 명시적으로 생성자를 만들지 못하게 private로 만들었다.
    public static int findMin(int[] arr){
        int min = arr[0]; // 초기값
        for (int i=0; i < arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = arr[0]; // 초기값
        for (int i=0; i < arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
