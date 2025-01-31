class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] a = new int[n+1];
        
        for(int i = 0; i < a.length; i++) {
            if(i == 0) {
                a[i] = 0;
            }
            else if(i == 1) {
                a[i] = 1;
            }
            else {
                a[i] = (a[i-1] % 1234567) + (a[i-2] % 1234567);
            }
        }
        answer = a[a.length - 1] % 1234567;
        return answer;
    }
}