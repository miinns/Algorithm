import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        // 큐 사용
        Queue<Integer> q = new LinkedList<>();
        
        // 큐가 비어있을 때 트럭 삽입
        int sum = 0;
        for(int i : truck_weights) {
            while(true) {
                if(q.isEmpty()) {
                    q.offer(i);
                    sum += i;
                    answer++;
                    break;
                }
                else if(q.size() == bridge_length) {
                    sum -= q.poll();
                }
                // 큐가 비어있지 않을 때 조건
                else {
                    if (sum + i > weight) {
                        q.offer(0);
                        answer++;
                    }
                // 다음 트럭
                    else {
                        q.offer(i);
                        sum += i;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}