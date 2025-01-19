class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 약수 계산
        for(int i = left; i <= right ; i++) {
            int num = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    num++;
                }
            }
            // 약수 홀/짝
            if(num % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        return answer;
    }
}