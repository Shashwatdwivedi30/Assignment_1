import java.util.*;
public class Count_digits  { 
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,s,c=0;
        n=sc.nextInt();
        s=sc.nextInt();
        for(int i=0;i<=9;i++) {
            int d = n % 10;
            if (d == s) {
                c++;
            }
            n /= 10;
        }
         System.out.println(c);
        }
    }


