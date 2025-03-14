import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 내림차순 정렬
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // 우선수위를 일단 넣음
        for(int num : priorities) {
            queue.add(num);
        }
        // 큐 빌 때까지 반복하기
        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                // 최댓값 (peek())
                if(priorities[i] == queue.peek()) {
                    queue.poll(); // 제거
                    answer++;
                    if(i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}