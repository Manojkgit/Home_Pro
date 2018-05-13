package aaaa_Program_Package;

import java.util.Hashtable;

import Base.Xls_Reader;

public class Using_Hashtable {

	public static void main(String[] args) {
		
	}
	
	
	

	
	public static void hashtable_Use(Xls_Reader xls,String TC){
        int testStart=1;
        String sheetName = "data";
        while(!xls.getCellData(sheetName, 0, testStart).equals(TC)){
        	testStart++;
        }System.out.println(testStart);
        
        int row=0;
        int rowStart=testStart+2;
        int colStart=testStart+1;
        while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
        	row++;
        }System.out.println(row);
        
        int col=0;
        while(!xls.getCellData(sheetName, col, colStart).endsWith("")){
        	col++;
        }System.out.println(col);
		
		Object[][] data=new Object[row][1];
		int RD=0;
		Hashtable<String,String> tab=null;
		for(int r=rowStart;r<rowStart+row;r++){
			tab=new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName,c,colStart);
				String value = xls.getCellData(sheetName,c,r);
				tab.put(key, value);
			}
		}
		data[RD][0]=tab;
		RD++;
	}
}
