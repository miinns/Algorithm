import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int n = sc.nextInt(); // 학생 수
            int[] arr = new int[n];

            int sum = 0;

            for (int j = 0; j < n; j++) {
                int score = sc.nextInt(); // 성적
                arr[j] = score;
                sum += score;
            }

            double avg = sum / n;
            double count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / n) * 100);
        }
    }
}