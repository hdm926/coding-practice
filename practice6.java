package practice;
import java.util.*;
public class practice6 {
	
	private static void swap(int a, int b) {
		int temp =a;
		a=b;
		b=temp;	
	}
	
	public static int gcb(int a, int b) {//���Լ��
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
	    System.out.println("���Լ��:" + gcb(m,n) );
	    System.out.println("��С������:" + m*n/gcb(m,n) );
	}
	
	
}
