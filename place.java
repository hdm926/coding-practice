package practice;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class place {
	public static void main(String[] arg) throws BiffException, IOException, RowsExceededException, WriteException {

	Workbook book = Workbook.getWorkbook(new File("C:\\Users\\h\\Desktop\\data.xls"));
	Sheet sheet = book.getSheet(0);
	Cell cell = null;
	int rows = sheet.getRows();
	int cols = sheet.getColumns();
	
	String[] province= new String[]{"�ӱ�ʡ","ɽ��ʡ" ,"����ʡ" ,"����ʡ","������ʡ","����ʡ","�㽭ʡ",
			"����ʡ","����ʡ" ,"����ʡ", "ɽ��ʡ", "����ʡ","����ʡ",
			"����ʡ" ,"�㶫ʡ" ,"����ʡ" ,"�Ĵ�ʡ" ,"����ʡ" ,"����ʡ" ,"����ʡ" ,"����ʡ",
			"�ຣʡ","������","�Ϻ���","������","�����","����ʡ","����ʡ","����ʡ","�½�ʡ",
			"���ɹ�"};
	
	Map<String,Integer> map = new HashMap<String,Integer>();
	
	for(int i=0; i<31; i++) {
		map.put(province[i],0);
	}
	
	for (int i = 2; i < 205; i++) {
		String str = sheet.getCell(3, i).getContents().substring(0, 2);		
		//System.out.println(str);
		for(int j=0;j<31;j++) {
			String str2=province[j].substring(0, 2);
			if(str.equals(str2)){
				int val=map.get(province[j]);
				//System.out.println(val);
				map.put(province[j], val+1);
			}
		         
	      }
	}
	Set<String> keys=map.keySet();
	Iterator<String> it=keys.iterator();
	while(it.hasNext()) {
		String key=it.next();
		int value=map.get(key);
		//System.out.println(key+" "+value);
	// 1������������(WritableWorkbook)���󣬴�excel�ļ������ļ������ڣ��򴴽��ļ�  
    WritableWorkbook writeBook = Workbook.createWorkbook(new File("C:\\Users\\h\\Desktop\\����ͳ��.xls"));  
	  
	// 2���½�������(sheet)���󣬲����������ڵڼ�ҳ  
	WritableSheet firstSheet = writeBook.createSheet("sheet1", 1);// ��һ������Ϊ�����������ƣ��ڶ�������Ϊҳ��           
	  
	// 3��������Ԫ��(Label)����
	for(int i=0;i<31;i++) {
		Label label1 = new Label(0+i, 0, province[i]);// ��һ������ָ����Ԫ����������ڶ�������ָ����Ԫ���������������ָ��д���ַ�������  
		firstSheet.addCell(label1); 
		Label label2 = new Label(0+i,1,map.get(province[i]).toString());
		firstSheet.addCell(label2);
	}       	        
	// 4����������ʼд�ļ�  
	writeBook.write();  	 	        
	writeBook.close(); 
	}
 }
}
