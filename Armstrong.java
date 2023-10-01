import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        for (int i = n; i <= n1; i++) {
            armstrong(i);
        }
    }
    static void armstrong(int a) {
        int n = 0, d1, sum = 0;
        int c = a;
        int b = a;
        while (b != 0) {
            b = b / 10;
            ++n;
        }
        while (c != 0) {
            d1 = c % 10;
            sum += (int) Math.pow(d1, n);
            c /= 10;
        }
        if (sum == a)
            System.out.println(a);
    }
}
