import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n,d=0,i=0;
        n=sc.nextInt();
        while (n != 0) {
            int t = n % 10;
            d += t * Math.pow(2, i);
            n = n / 10;
            i++;
        }
        System.out.println(d);
    }
