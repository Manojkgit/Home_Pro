package zzzzzzz;

import java.util.Hashtable;

public class ExcelUtilData_DDF {
	
	public static Object[][] getDataFromExcel(Xls_Reader xls,String TC){
		String sheetName = "data";
		int startTest=1;
		while(!xls.getCellData(sheetName, 0, startTest).equals(TC)){
			startTest++;
		}System.out.println(startTest);
		
		int rowStart=startTest+2;
		int colStart=startTest+1;
		int row=0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}System.out.println(row);
		int col=0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}System.out.println(col);

		Object[][] data=new Object[row][1];
		Hashtable<String,String> tb=null;
		int RD=0;
		for(int r=rowStart;r<rowStart+row;r++){
			tb=new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key =xls.getCellData(sheetName, c, colStart);
				String value  = xls.getCellData(sheetName, c, r);
				tb.put(key, value);
			}
			data[RD][0]=tb;
			RD++;
		}
		return data;
	}

}
