package interviewPractise;

import java.util.Hashtable;
import zzzzzzz.Xls_Reader;

public class DataExcelReader {
	public Object[][] getData(Xls_Reader xls,String TC){
         String sheetName="data";
         int testStart=1;
         while(!xls.getCellData(sheetName, 0, testStart).equals(TC)){
        	 testStart++;
         }System.out.println(testStart);         
         int rowStart=testStart+2;
         int colStart=testStart+1;
         int row=0;
         while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
        	 row++;
         }System.out.println(row);
         
         int col=0;
         while(!xls.getCellData(sheetName, col, colStart).equals("")){
        	 col++;
         }System.out.println(col);
         
         Hashtable<String,String> tab=null;
         Object[][] data=new Object[row][1];
         int RD=0;
         for(int r=rowStart;r<rowStart+row;r++){
        	 tab=new Hashtable<String,String>();
        	 for(int c=0;c<col;c++){
        		 String key=xls.getCellData(sheetName, c, colStart);
        		 String value=xls.getCellData(sheetName, c, r);
        		 tab.put(key, value);
        	 }
        	 data[RD][0]=tab;
        	 RD++;
         }
         return data;
	}
}
