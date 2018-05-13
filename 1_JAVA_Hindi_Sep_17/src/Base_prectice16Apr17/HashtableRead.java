package Base_prectice16Apr17;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashtableRead {
     @Test(dataProvider="readgetData")
     public void login(Hashtable<String,String> data){
    	 System.out.println(data.get("Runmode") + " -- " +data.get("col1")+ "---- " + data.get("col2"));
     }
     @DataProvider  
     public Object[][] readgetData() {
      Xls_Reader xls = new Xls_Reader("C:\\Users\\ti01045\\Desktop\\ReadTestData.xlsx");
      String SheetName = "TestData";
      String TestCaseName = "TestC";
      int TestStartNo = 1;
      while(!xls.getCellData(SheetName, 0, TestStartNo).equals(TestCaseName)){
    	  TestStartNo++;
      }
      System.out.println("ow start no...." + TestStartNo);
      int rowStart=TestStartNo+2;
      int colStart=TestStartNo+1;
      int row=0;
      while(!xls.getCellData(SheetName, 0, rowStart+row).equals("")){
    	  row++;
      }
      System.out.println("Row no. -- " + row);
      int col=0;
      while(!xls.getCellData(SheetName, col, colStart).equals("")){
    	  col++;
      }
      System.out.println(col);
       Object[][] data = new Object[row][1];
       int rowData=0;
       Hashtable<String,String> table = null;
        for(int r=rowStart;r<rowStart+row;r++){
        	table = new Hashtable<String,String>();
        	for(int c=0;c<col;c++){
        		String key = xls.getCellData(SheetName, c, colStart);
        		String value = xls.getCellData(SheetName, c, r);
        	    table.put(key, value);
        		
        	}
        	data[rowData][0] = table;
        	rowData++;
          }
        return data;
     }
    
}
