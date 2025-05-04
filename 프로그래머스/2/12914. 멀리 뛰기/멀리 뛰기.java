class Solution {
    public long solution(int n) {
        int[] dp = new int[2001]; // n 2000이하
        // 1칸, 2칸 뛸 수 있기 때문에 두 가지 경우는 초기화
        dp[1] = 1;
        dp[2] = 2;
        // 3부터 반복
        for(int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }
        return dp[n];
    }
}