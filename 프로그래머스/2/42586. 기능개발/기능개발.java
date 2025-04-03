import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // 먼저 시작한 작업이 배포 -> FIFO -> 큐
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            queue.offer((100 - progresses[i]) / speeds[i] + 
                ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1)); // 나머지가 존재하면 + 1
        }        
        // 배열로 저장
        int cnt = 1;
        int now = queue.poll(); // 첫번 째 작업 완료 꺼내옴 (poll)
        ArrayList<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            int next = queue.poll(); // 다음 작업 완료 꺼내옴 (poll)
            if(now >= next) {
                cnt++;
            }
            else {
                list.add(cnt);
                now = next;
                cnt = 1;
            }
        }
        list.add(cnt);
        
        // return 값 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}