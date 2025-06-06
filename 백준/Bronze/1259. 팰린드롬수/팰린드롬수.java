import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean n = true;
            String s = sc.next();
            if (s.equals("0"))
                break;
            int sta = s.length() / 2;
            int end = s.length() - 1;

            for (int i = 0; i < sta; i++) {
                if (s.charAt(i) != s.charAt(end)) {
                    n = false;
                    break;
                }
                end--;
            }
            System.out.println(n ? "yes" : "no");
        }
    }
}