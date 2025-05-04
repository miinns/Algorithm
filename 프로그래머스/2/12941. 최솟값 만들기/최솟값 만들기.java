import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 배열 길이 만큼 반복, 배열의 역순으로 곱셈 후 누적 값 더하기
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length - i - 1];
        }
        return answer;
    }
}