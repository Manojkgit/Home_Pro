package Base_prectice16Apr17;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel_Object {
   @Test(dataProvider="readgetData")
   public void testlogin(String Runmode, String col1,String col2,String col3,String col4){
    }

   @DataProvider  
     public Object[][] readgetData() {
      Xls_Reader xls = new Xls_Reader("C:\\Users\\ti01045\\Desktop\\ReadTestData.xlsx");
      String SheetName = "TestData";
      String TestCaseName = "TestB";
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
      }System.out.println(col);
      Object[][] data = new Object[row][col];
      int DataRow=0;
      for(int r=rowStart;r<rowStart+row;r++){
    	  
    	  for(int c=0;c<col;c++){
    		data[DataRow][c] = xls.getCellData(SheetName, c, r);
       	  } 
    	  DataRow++; 
     }
	return data;
    }
}
