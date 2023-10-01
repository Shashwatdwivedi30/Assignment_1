import java.util.*;
public class Series {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        series(n,n1);}
    static void series(int n,int n1) {
            for (int i = 1; i <= n; i++) {
                int x = 3 * i + 2;
                if (x % n1 == 0) {
                    n++;
                }
                else System.out.println(x);
            }
    }
}
