import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED",  "THU", "FRI", "SAT"};
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < a - 1; i++) {
            b += months[i];
        }
        System.out.println(days[b % 7]);
    }
}