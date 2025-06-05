import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] result = new int[1001];
        int count = 0;
        int sum = 0;

        for(int i = 1; i < b + 1; i++) {
            for(int j = 1; j <= i; j++) {
                if(count >= result.length - 1)
                    break;
                result[count] = i;
                count++;
            }
        }
        for(int j = a - 1; j <= b - 1; j++) {
            sum += result[j];
        }
        System.out.println(sum);
    }
}