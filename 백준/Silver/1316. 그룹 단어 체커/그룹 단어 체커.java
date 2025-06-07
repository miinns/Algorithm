import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어 개수
        int count = 0;

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            boolean[] ch = new boolean[26]; // 단어 사용 확인
            boolean group = true;

            for(int j = 0; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                if(ch[index]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        group = false;
                        break;
                    }
                }
                else {
                    ch[index] = true;
                }
            }
            if(group) count++;
        }
        System.out.println(count);
    }
}