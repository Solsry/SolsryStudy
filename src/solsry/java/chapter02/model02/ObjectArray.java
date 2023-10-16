package solsry.java.chapter02.model02;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    // 생성 동작
    public ObjectArray(){
        // elements = new Object[DEFAULT_CAPACITY]; // 5개 크기 배열
        this(5); // this(5) : 생성자 안에서 다른 생성자를 호출할 때 사용
    }
    public ObjectArray(int capacity){
        elements = new Object[capacity]; // 원하는 크기의 배열을 생성한다. // 범용성 면에서 더 좋음
    }

    // 저장하는 동작
    public void add(Object element){ // 다형성 인수
        if (size == elements.length){
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // 얻는 동작
    public Object get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index의 범위(0~9)가 초과됨."); // JVM
        }
        return elements[index];
    }

    // 원소의 개수를 체크하는 동작
    public int size(){
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2;
        Arrays.copyOf(elements,newCapacity);
    }
}
