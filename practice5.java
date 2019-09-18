package practice;

import java.util.*;
public class practice5 {

	public static void main(String[] arg) {
		char grade;
		int x;
		Scanner s=new Scanner(System.in);
		x = s.nextInt();
		grade =  x>=90?'A'
				:x>=60?'B'
				:'C';
		System.out.print(grade);
	}
}
