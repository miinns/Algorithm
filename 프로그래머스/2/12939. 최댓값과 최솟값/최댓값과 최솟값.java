class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length; i++) {
            int num = Integer.parseInt(a[i]);
            
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        answer = min + " " + max;
        return answer;
    }
}