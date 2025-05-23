class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 0; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    // 최대공약수 구하기
    public int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
    // 최소공배수 구하기
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}