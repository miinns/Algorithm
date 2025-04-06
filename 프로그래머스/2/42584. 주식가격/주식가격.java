import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        // Queue 사용
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i : prices) {
            queue.add(i);
        }
        
        int count = 0;
        // 조건문(큐가 빈공간 X)
        while(!queue.isEmpty()) {
            int price = queue.poll(); // 반환 (poll)
            for(int i = (prices.length - queue.size()); i < prices.length; i++) {
                // 가격이 떨어진 경우
                if(price > prices[i]) {
                    answer[count]++;
                    break;
                }
                if(price <= prices[i]) {
                    answer[count]++;
                }
            }
            count++;
        }
        return answer;
    }
}