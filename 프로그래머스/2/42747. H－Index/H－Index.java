import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            // 인용 횟수가 같거나 많을 때 => h-index
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}