import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        // 내림차순 정렬
        Arrays.sort(str, Collections.reverseOrder());
        
        for(int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}