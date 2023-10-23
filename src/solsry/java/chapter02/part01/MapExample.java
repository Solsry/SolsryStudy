package solsry.java.chapter02.part01;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> stdScores=new HashMap<>();
        // 데이터 추가
        stdScores.put("Kim", 95);
        stdScores.put("Lee", 85);
        stdScores.put("Park", 90);
        stdScores.put("Choi", 80);

        // 데이터 조회
        System.out.println("Kim's score:" + stdScores.get("Kim"));
        System.out.println("Lee's score:" + stdScores.get("Lee"));

        // 데이터 수정
        stdScores.put("Park", 92);
        System.out.println("Park's score:" + stdScores.get("Park"));

        // 데이터 삭제
        stdScores.remove("Choi");
        System.out.println("Choi's score removal:" + stdScores.get("Choi")); // null

        // 전체 데이터 출력
        for(Map.Entry<String, Integer> entry :stdScores.entrySet()){
            System.out.println(entry.getKey() + "'s score:"+entry.getValue());
        }
    }
}
