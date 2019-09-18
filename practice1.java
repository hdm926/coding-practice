package practice;

public class practice1 {

	public static void main(String[] arg) {
		System.out.println(1);
		System.out.println(1);
		int f1=1,f2=1,M=24;
		int count;
		for(int i=3;i<=M;i++) {
			count=f1+f2;
			f1=f2;
			f2=count;
			System.out.println(count);
		}
	}
}
