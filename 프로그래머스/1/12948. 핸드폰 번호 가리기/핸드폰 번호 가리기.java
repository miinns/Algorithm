class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //for문으로 반복
        for(int i = 0; i < phone_number.length(); i++){
        //if문으로 뒤에 4자리 제외하고 * 출력
            if(i < phone_number.length() - 4)
                answer += "*";
            else
                answer += phone_number.charAt(i); // charAt(i): 원하는 위치의 문자를 가져올 수 있는 함수
            }
        return answer;
    }
}