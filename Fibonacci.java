import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=0,i,n;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);
    }
}
