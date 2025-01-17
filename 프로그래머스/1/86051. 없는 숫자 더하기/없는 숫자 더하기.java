class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] a = {10};
        //전체 합계에서 numbers.length를 빼기
        for(int i = 0; i < 10; i++){
            answer += i;
        }
        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}