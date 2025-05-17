class Solution {
    int[] numbers;
    int target;
    int answer;
    
    // dfs
    void dfs(int index, int sum) {
        // 1. 재귀 탈출 조건
        if(index == numbers.length) {
            if(sum == target) answer++;
            return;
        }
        // 2. 수행 동작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        // dfs (0,0) 호출 (첫 번째 파라미터 index, 두 번째 파라미터 sum)
        dfs(0, 0);
        return answer;
    }
}