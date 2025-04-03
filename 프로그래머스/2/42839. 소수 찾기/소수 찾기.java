import java.util.*;

class Solution {
    char[] nums;
    boolean[] visited; // (중복 사용 판별)
    HashSet<Integer> set = new HashSet<>(); // 소수 저장(중복 제외)
    
    public int solution(String numbers) {
        nums = new char[numbers.length()];
        visited = new boolean[numbers.length()];
        // numbers를 문자로 변환
        for(int i = 0; i < numbers.length(); i++) {
            nums[i] = numbers.charAt(i);
        }
        dfs("");
        return set.size(); // HashSet에 저장한 개수 반환
    }
    
    // DFS (백트래킹)
    void dfs(String str) {
        if(str.length() != 0) {
            int num = Integer.parseInt(str);
            if(isPrime(num)) {
                set.add(num);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                if(str.length() == 0 && nums[i] == '0')
                    continue;
                visited[i] = true;
                dfs(str + nums[i]);
                visited[i] = false;
            }
        }
    }
        // 소수 판별 함수
        boolean isPrime(int n) {
            if(n == 0 || n == 1) 
                return false;
            for(int i = 2; i <= Math.sqrt(n); i++) 
               if(n % i == 0) {
                   return false;
        }
        return true;
    }
}