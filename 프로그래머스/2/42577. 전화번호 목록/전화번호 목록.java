import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        boolean answer = true;
        
        // phone_book HashMap 저장
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        
        // 접두어가 있는 경우 false, 없는 경우 true
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }
}