package practice;
import java.util.*;
public class practice8 {

	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int n=s.nextInt();
		
		int sum = 0,b = 0;
		for(int i=0;i<n;i++) {
			b=b+a;
			sum+=b;
			a=a*10;
		}
		System.out.println(sum);
	}
}
