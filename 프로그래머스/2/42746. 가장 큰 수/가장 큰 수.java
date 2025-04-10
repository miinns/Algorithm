import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // int를 string으로 변환
        String[] str = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        
        // compareTo로 큰 수 비교 / 큰 수가 앞에 오도록 내림차순 정렬
        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        // 맨 앞이 0인 경우 0 출력
        if(str[0].equals("0")) {
            return "0";
        }
        
        // Buffer에 담아 시간 초과 방지
        StringBuffer s =  new StringBuffer();
        for(int i = 0; i < str.length; i++){
            s.append(str[i]);
        }
        return s.toString();
    }
}