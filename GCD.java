import java.util.*;
public class GCD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, i, hcf=0;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for (i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
