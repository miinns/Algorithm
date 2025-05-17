import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        // 알파벳 카운트
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        // 가장 많이 사용된 알파벳 출력 / 여러 개 -> 물음표 출력
        int max = 0;
        char answer = '?';
        for(int i = 0; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                answer = (char)(i + 'A');
            }
            else if(max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}