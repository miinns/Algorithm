import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int str = a;
        int count = 0;

        while(true) {
            a = (a % 10 * 10) + ((a / 10 + a % 10) % 10);
            count++;
            if(str == a) {
                break;
            }
        }
        System.out.println(count);
    }
}