import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int[] result = new int[a];

        for(int i = 0; i < a; i++) {
            Integer[] arr = new Integer[10];
            String[] str = sc.nextLine().split(" ");

            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }
            Arrays.sort(arr, Collections.reverseOrder());
            result[i] = arr[2];
            }
        for(int i = 0; i < a; i++) {
            System.out.println(result[i]);
        }
    }
}