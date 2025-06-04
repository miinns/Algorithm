import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] b = new double[a];
        double avg, max = 0, sum = 0;

        for(int i = 0; i < b.length; i++) {
           b[i] = sc.nextInt();
           if(b[i] > max)
               max = b[i];
           }
        for(int i = 0; i < b.length; i++) {
            b[i] = (b[i]/max)*100;
            sum += b[i];
        }
        avg = sum / a;
        System.out.println(avg);
    }
}