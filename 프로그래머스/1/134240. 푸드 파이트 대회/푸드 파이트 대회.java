class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer a = new StringBuffer();
        
        for(int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for(int j = 0; j < count; j++) {
                a.append(i);   
            }
        }
        String s = a.toString(); // 문자열로 변환해서 return해야 함
        answer = s + "0" + a.reverse();
        return answer;
    }
}