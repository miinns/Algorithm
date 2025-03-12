class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length() + 1;
        Long pLong = Long.parseLong(p);
        
        for(int i = 0; i < length; i++) {
            String T = t.substring(i, i + p.length());
            
            if(Long.parseLong(T) <= pLong) {
                answer++;
            }
            
        }
        return answer;
    }
}