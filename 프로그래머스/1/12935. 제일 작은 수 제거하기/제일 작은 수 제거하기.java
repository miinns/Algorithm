import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        List<Integer> arr1 = new ArrayList<>();
        for (int a : arr) {
            arr1.add(a);
        }
        Arrays.sort(arr);
        
        int min = arr[0];
        arr1.remove(Integer.valueOf(min));
        
        int[] answer = new int[arr1.size()];
        for(int i = 0; i< arr1.size(); i++) {
            answer[i] = arr1.get(i);
        }
        return answer;
    }
}