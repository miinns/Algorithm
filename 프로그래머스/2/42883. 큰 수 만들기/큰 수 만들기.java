class Solution {
    public String solution(String number, int k) {
        StringBuilder s = new StringBuilder();
        // 가장 큰 수 저장
        char max;
        // 인덱스
        int cur = 0;
        for(int i = 0; i < number.length() - k; i++) {
            max = 0;
            for(int j = cur; j <= k + i; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j);
                    cur = j + 1;
                }
            }
            s.append(max);
        }
        return s.toString();
    }
}