package practice;

import java.util.Scanner;
import java.util.*;

public class practice7 {

	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		String str;
		str=s.nextLine();
		
		int digital=0;
		int character=0;
		int blank=0;
		int other=0;
	
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') 
				blank+=1;
			else if(ch>='0' && ch<='9') 
				digital+=1;
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) 
				character+=1;
			else
				other+=1;
				
		}
		System.out.println("�ո�"+blank);
		System.out.println("���֣�"+digital);
		System.out.println("��ĸ��"+character);
		System.out.println("������"+other);
	}
}
