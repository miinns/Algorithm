class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최소공배수 = 두 수 곱 / 최대공약수
        answer[0] = gcd(n, m);
        answer[1] = (n * m)  / answer[0];
        return answer;
    }
    
    // 최대공약수 구하기
    public int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
