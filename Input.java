import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000000];
        int s = 0, i;
        for (i = 0; i < a.length; i++) {
            int n = sc.nextInt();
            s += n;
            if (s < 0) {
                break;
            }else{
            System.out.println(n);}
        }
    }
}
