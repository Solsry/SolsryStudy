package solsry.java.model;

import solsry.java.part02.Person;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    @Override
    public String toString() {
        return "PersonVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    // defalut Constructor ( 기본 생성자 ) 가 생략되어 있지만 생성자 메서드는 있다.
    public PersonVO(){
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체의 초기화를 한다.
//        this.name="solsolsol";
//        this.age=50;
//        this.phone="010-0000-0000";
    }
    public PersonVO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
