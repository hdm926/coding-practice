package practice;
import java.util.*;
public class practice6 {
	
	private static void swap(int a, int b) {
		int temp =a;
		a=b;
		b=temp;	
	}
	
	public static int gcb(int a, int b) {//最大公约数
		if(a<b)
			swap(a,b);
		
		if(a%b==0)
			return b;
		
		return gcb(b,a%b);
		
	}

	public static void main(String[] arg0) {
		int m,n;
	    Scanner s=new Scanner(System.in);
	    m=s.nextInt();
	    n=s.nextInt();
	    System.out.println("最大公约数:" + gcb(m,n) );
	    System.out.println("最小公倍数:" + m*n/gcb(m,n) );
	}
	
	
}
