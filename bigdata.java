package practice;

import java.io.File;  
import java.io.InputStreamReader;  
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileInputStream;  
import java.io.FileWriter;  
 
public class bigdata {  
    public static void main(String args[]) {  
        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw  
  
            /* 读入TXT文件 */  
            String pathname = "C:\\Users\\h\\Desktop\\wealth1951.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径  
            File filename = new File(pathname); // 要读取以上路径的input。txt文件  
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); // 建立一个输入流对象reader  
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言  
            
            File writename = new File("C:\\Users\\h\\Desktop\\output.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件  
            writename.createNewFile(); // 创建新文件  
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
            out.flush(); // 把缓存区内容压入文件  
            out.close(); // 最后记得关闭文件        
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}  