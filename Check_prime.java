import java.util.*;
public class Check_prime {
	static void prime(int n){
        int i,c=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
		   System.out.println("Prime");
		else
		   System.out.println("Not Prime");
    }
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		prime(n);
	}
}
