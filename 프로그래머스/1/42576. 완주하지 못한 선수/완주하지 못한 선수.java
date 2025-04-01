import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        // 참여자 명단 저장
        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주자 명단에 참여자 명단이 존재하면 -1
        for(String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // HashMap 돌려서 0이 아닌 참여자 찾기
        for(String k : map.keySet()) {
            if(map.get(k) != 0) {
                return k;
            }
        }
        
        return answer;
    }
}