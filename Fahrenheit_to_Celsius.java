import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int min,max,s,c;
    min=sc.nextInt();
    max=sc.nextInt();
    s=sc.nextInt();
    for(int i=min;i<=max;i+=s){
        c=((i-32)*5)/9;
        System.out.println(i+" "+c);
        }
    }
}
