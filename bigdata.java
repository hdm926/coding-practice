package practice;

import java.io.File;  
import java.io.InputStreamReader;  
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileInputStream;  
import java.io.FileWriter;  
 
public class bigdata {  
    public static void main(String args[]) {  
        try { // ��ֹ�ļ��������ȡʧ�ܣ���catch��׽���󲢴�ӡ��Ҳ����throw  
  
            /* ����TXT�ļ� */  
            String pathname = "C:\\Users\\h\\Desktop\\wealth1951.txt"; // ����·�������·�������ԣ������Ǿ���·����д���ļ�ʱ��ʾ���·��  
            File filename = new File(pathname); // Ҫ��ȡ����·����input��txt�ļ�  
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); // ����һ������������reader  
            BufferedReader br = new BufferedReader(reader); // ����һ�����������ļ�����ת�ɼ�����ܶ���������  
            
            File writename = new File("C:\\Users\\h\\Desktop\\output.txt"); // ���·�������û����Ҫ����һ���µ�output��txt�ļ�  
            writename.createNewFile(); // �������ļ�  
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
          
  
            String line = ""; 
            while (line != null) {
            	line = br.readLine();
            	//System.out.println(line);
            	String[] sub1={"","","","","","","",""};
            	sub1=line.split(";");
            	
            	if(sub1[2]=="1951" || sub1[2]=="2008") {
            	    String str=sub1[0]+sub1[2]+sub1[3]+sub1[4]+sub1[5];            	
            	    out.write(str);
            	}            	  
                                 
            } 
            out.flush(); // �ѻ���������ѹ���ļ�  
            out.close(); // ���ǵùر��ļ�        
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}  