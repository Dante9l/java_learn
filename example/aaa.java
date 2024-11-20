import java.util.Date;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long cur1 = System.currentTimeMillis();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        long cur2 = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println("优化前:" + (cur2 - cur1));

        long cur3 = System.currentTimeMillis();
        long sum1 = (long) n * (n + 1) / 2;
        System.out.println(sum1);
        long cur4 = System.currentTimeMillis();
        System.out.println("优化后: " + (cur4 - cur3));
    }
}
