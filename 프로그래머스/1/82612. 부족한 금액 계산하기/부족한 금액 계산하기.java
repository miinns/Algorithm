class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total_price = 0;
        //count만큼 price 더하기
        for(int i = 1; i < count+1; i++) {
            total_price += price * i;   
        }
        //부족한 금액 계산
        if(money < total_price)
            answer = total_price - money;
        return answer;
    }
}