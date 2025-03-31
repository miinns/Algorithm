import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();     
        int answer = 1;
        
        for(int i = 0; i < clothes.length; i++) {
            // 종류에 따라 몇개씩 있는지 저장해주기 
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1); 
        }
        
        for(String K : map.keySet()) {
            answer *= (map.get(K) + 1);   // 안입는 경우 + 1
        }
        
        answer -= 1; // 모두 '안입음'일 경우 -1 
        
        return answer;
    }
}