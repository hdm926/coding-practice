package practice;
import java.util.*;

public class practice4 {

	public static void main(String[] arg) {
		java.util.Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int k=2;
		while(k<=n) {
			if(n%k==0) {
				System.out.println(k);
				n=n/k;
			}
			else
				k+=1;
		}
	}
}
