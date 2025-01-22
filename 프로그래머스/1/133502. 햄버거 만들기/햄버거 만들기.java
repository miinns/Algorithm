import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int totalsize = 0;
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < ingredient.length; i++) {
            s.push(ingredient[i]);
            
            if(s.size() >= 4) {
                totalsize = s.size();
                if(s.get(totalsize-1) == 1 && s.get(totalsize - 2) == 3 && s.get(totalsize - 3) == 2 && s.get(totalsize - 4) == 1) {
                    answer++;
                    s.pop();
                    s.pop();
                    s.pop();
                    s.pop();
                }
            }
        }
        return answer;
    }
}