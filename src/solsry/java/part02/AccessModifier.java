package solsry.java.part02;

import solsry.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name="solsry";
        // dto.age=1000;// 에러발생(접근불가)
        dto.phone="010-9999-9999";
        System.out.println(dto.name+"\t"+dto.phone);
        dto.play();
    }
}
