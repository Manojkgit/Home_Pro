package Util_File;

import java.util.Hashtable;

public class ExcelReader{
	public Xls_Reader xls;
	public static boolean isRunableColumn(String testCase, Xls_Reader xls){
        String sheetName = "TestCase";
        int rowCount = xls.getRowCount(sheetName);
        for(int r=2;r<=rowCount;r++){
        	String tname=xls.getCellData(sheetName, "TestCaseID", r);
        	if(tname.equals(testCase)){
        		String runmode = xls.getCellData(sheetName, "Runmode", r);
        		if(runmode.equals("Y")){
        			return true;
        		}else return false;
        	}
        } 	return false;
	}
	
	public static Object[][] readDataFromExcel_Util_Aug(Xls_Reader xls,String testCaseName){	
	      String sheetName = "TestCase";
	      int StartTest = 1;
		  while(!xls.getCellData(sheetName, 0, StartTest).equals(testCaseName)){
			  StartTest++;
		  }System.out.println(StartTest);
          int RowStart=StartTest+2;
          int ColStart=StartTest+1;
          int row=0;
          while(!xls.getCellData(sheetName, 0, RowStart+row).equals("")){
        	  row++;
          }System.out.println(row);
          int col=0;
          while(!xls.getCellData(sheetName, col, ColStart).equals("")){
        	  col++;
          }System.out.println(col);
          Object[][] data = new Object[row][1];
          Hashtable<String,String> table = null;
          int RowData=0;
          for(int r=RowStart;r<RowStart+row;r++){
          table = new Hashtable<String,String>();
           for(int c=0;c<=col;c++){
        	   String key = xls.getCellData(sheetName, c, ColStart);
        	   String value = xls.getCellData(sheetName, c, r);
        	   table.put(key, value);
           }

           data[RowData][0]=table;
            RowData++;
          }
          return data;
	
	}
	public static boolean isrunable(Xls_Reader xls,String testName){
		String sheetName="Cases";
		int rowCount=xls.getColumnCount(sheetName);
		for(int r=2;r<=rowCount;r++){
			String tname= xls.getCellData(sheetName, "TCID", r);
			if(tname.equals(testName)){
				String runmode = xls.getCellData(sheetName, "Runmode", r);
				if(runmode.equals("Y")){
					return true;
				}else return false;
			}
		}
		return false;
	}
	
	
	
	
	
	
}
