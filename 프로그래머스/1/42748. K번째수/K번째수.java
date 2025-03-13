import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arr1.add(array[j]);
            }
            Collections.sort(arr1);
            answer[i] = arr1.get(commands[i][2] - 1);
        }
        return answer;
    }
}