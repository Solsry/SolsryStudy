package solsry.java.chapter02.model02;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;

    public IntArray(){
        elements = new int[DEFAULT_CAPACITY]; // 5개 크기 배열
    }
    // 저장하는 동작
    public void add(int element){
        if (size == elements.length){
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2;
        Arrays.copyOf(elements,newCapacity);
    }

    // 얻는 동작
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }
    // 원소의 개수를 체크하는 동작
    public int size(){
        return size;
    }
}
