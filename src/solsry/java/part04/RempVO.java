package solsry.java.part04;

import solsry.java.part04.Employee;

// 일반 사원
public class RempVO extends Employee {
    public RempVO(){
        super();
    }
    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        // 초기화(자식이 부모의 기억공간에 초기화를 하는 경우)
        super(name,age,phone,empDate,dept,marriage); // 부모의 생성자 호출
    }
}
