package Base;

import java.util.Hashtable;

public class DataUtil_Sender {
    public static Object[][] getTestData(Xls_Reader xls, String testcase){
	   String SheetName = "TestData";
	   int TestStartRow = 1;
	   while(!xls.getCellData(SheetName, 0, TestStartRow).equals(testcase)){
		   TestStartRow++;
	   }
	   System.out.println(TestStartRow);
	   int ColStartNO = TestStartRow+1;
	   int RowStartNo = TestStartRow+2;
	   int row=0;
	   while(!xls.getCellData(SheetName, 0, RowStartNo+row).equals("")){
		   row++;
	   }
	   System.out.println(row);
	   int col=0;
	   while(!xls.getCellData(SheetName, col,ColStartNO).equals("")){
		   col++;
	   }
	   System.out.println(col);
  
	   Object[][] data = new Object[row][1];
	   int DataRow =0;
	   Hashtable<String,String> table = null;
	   for(int r=RowStartNo;r<RowStartNo+row;r++){
             table = new Hashtable<String,String>();
		   for(int c=0;c<col;c++){
			   String key = xls.getCellData(SheetName, c, ColStartNO);
			   String value= xls.getCellData(SheetName, c, r);
			   table.put(key, value);
		   }
		   data[DataRow][0] = table;
		   DataRow++;
	   }
	    return data;
  }
    public static boolean isrunable(Xls_Reader xls,String testName){
		String sheetName="Case";
		int rowCount=xls.getColumnCount(sheetName);
		for(int r=2;r<=rowCount;r++){
			String tname= xls.getCellData(sheetName, "TCID", r);
			if(tname.endsWith(testName)){
				String runmode = xls.getCellData(sheetName, "Runmode", r);
				if(runmode.endsWith("Y")){
					return true;
				}else return false;
			}
		}
		return false;
	}            	
}
