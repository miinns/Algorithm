class Solution {
    public int[] solution(long n) {
        // 문자열 변환
        String[] str = Long.toString(n).split("");
        int[] answer = new int[str.length];
        // 뒤집기
        for(int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[str.length - 1 - i]);
        }
        return answer;
    }
}