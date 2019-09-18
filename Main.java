package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		while(true) {
			int N=0,T=0;
			double sum=0;
			ArrayList<Integer> food = new ArrayList<>();
			
			Scanner s = new Scanner(System.in);
			N=s.nextInt();
			T=s.nextInt();
			
			while(N>0) {
				Scanner s2= new Scanner(System.in);
				food.add(s2.nextInt());
				}
			
			int[] foodper[];
			int index=0;
			for(int i=0;i<food.size();i+=2) {
				foodper[index]=food.get(i+1)/food.get(i);
			}
			}
			
	}
	

}
