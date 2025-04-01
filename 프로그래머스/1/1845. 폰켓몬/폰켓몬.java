import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        
        // HashSet 저장 -> 중복 제외하고 저장
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        int size = set.size();
        
        if(size >= count) {
            answer = count;
        }
        else {
            answer = size;
        }
        
        return answer;
    }
}