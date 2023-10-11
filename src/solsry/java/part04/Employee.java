package solsry.java.part04;
// 사원(VO, DTO)
public class Employee extends Object {
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    public Employee() {
        super(); // 상위 클래스의 생성자를 호출하는 클래스 -> new Object()
    }
}
