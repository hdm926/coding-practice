package practice;

public class practice2 {

	public static void main(String[] arg) {
		int count = 0;
		for(int i=101;i<200;i++) {
			for(int j=5;j<=Math.sqrt(i);j+=6) {
				if(i%j==0 || i%(j+2)==0) 
					break;	
				else {
					count+=1;
					System.out.println(i);
					break;
				}
					
			}
		}
		System.out.println(count);
	}
}
