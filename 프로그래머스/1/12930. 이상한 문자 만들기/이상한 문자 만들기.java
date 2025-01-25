class Solution {
    public String solution(String s) {
        String answer = "";
        // 공백을 기준으로 홀,짝 구분
        String[] arr = s.split("");
        int a = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if((" ").equals(arr[i])) a = 0;
            else {
                if(a % 2 == 0) {
                    a++;
                    arr[i] = arr[i].toUpperCase();
                }
                else {
                    a++;
                    arr[i] = arr[i].toLowerCase();
                }
            }
            answer += arr[i];
        }
        return answer;
    }
}