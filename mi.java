import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class Main {


/*������������������ʵ����ĿҪ��Ĺ���
��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
******************************��ʼд����******************************/
    static String solution(String input) {
    	//�ݹ�
    	char[] in =input.toCharArray();
    	stack<char> num;
    	stack<char> str;
    	
    	for(char c:in) {
    		if(c+0>0) {
    			num.push(c);
    		}
    		else
    			str.push(c)
    	}
    	
        
    }
 
/******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int _prices_size = 0;
        _prices_size = Integer.parseInt(in.nextLine().trim());
        int[] _prices = new int[_prices_size];
        int _prices_item;
        for(int _prices_i = 0; _prices_i < _prices_size; _prices_i++) {
            _prices_item = Integer.parseInt(in.nextLine().trim());
            _prices[_prices_i] = _prices_item;
        }
        
        int _budget;
        _budget = Integer.parseInt(in.nextLine().trim());
  
        res = solution(_prices, _budget);
        System.out.println(String.valueOf(res));    

    }
}
