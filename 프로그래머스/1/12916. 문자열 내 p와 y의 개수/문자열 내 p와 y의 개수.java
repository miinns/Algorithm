class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pcount = 0;
        int Ycount = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {
                Pcount ++;
            }
            else if(s.charAt(i) == 'y') {
                Ycount ++;
            }
        }
        if(Pcount != Ycount) {
            answer = false;
        }
        return answer;
    }
}