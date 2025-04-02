import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] count = new int[3];
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};
        
        // 맞춘 개수 구하기 (반복 패턴 -> 나머지 연산 사용)
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i % 5]) {
                count[0]++;
            }
            if(answers[i] == b[i % 8]) {
                count[1]++;
            }
            if(answers[i] == c[i % 10]) {
                count[2]++;
            }
        }
        
        // Math.max로 가장 많이 맞춘 개수 구하기
        int maxScore = Math.max(count[0], Math.max(count[1], count[2]));
        
        //List 선언 -> max와 같으면 add
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(maxScore == count[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }
}