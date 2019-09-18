package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] arg) {
		
		while(true) {
		int N=0,A=0,X=0;
		double sum=0;
		ArrayList<Integer> per = new ArrayList<>();
		
		Scanner s= new Scanner(System.in);
		N=s.nextInt();
		A=s.nextInt();
		X=s.nextInt();
		
		Scanner s2= new Scanner(System.in);
		for(int i=0;i<N;i++) {
			per.add(s2.nextInt());
			sum+=per.get(i);
		}
		
	    int a=X*60;
	    int sum2=0;
		sum2=(int) Math.ceil(sum/A);
		double b=sum - (a*A);
		if(sum2>a) {
			sum2=sum2-a;
			sum2+=b;
		}
			
		if(sum2<=8*60)
			System.out.println(sum2);
		else
			System.out.println(0);
	}
	}
}
