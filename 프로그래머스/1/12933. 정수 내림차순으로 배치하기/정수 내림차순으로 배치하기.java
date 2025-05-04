import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // Long -> String으로 변환, 저장
        String[] num = String.valueOf(n).split("");
        
        // 내림차순 정렬
        Arrays.sort(num, Collections.reverseOrder());
        
        // String 합치기
        String Snum = new String();
        for(int i = 0; i < num.length; i++) {
            Snum += num[i];
        }
        
        // String -> Long으로 변환
        answer = Long.parseLong(Snum);
        return answer;
    }
}