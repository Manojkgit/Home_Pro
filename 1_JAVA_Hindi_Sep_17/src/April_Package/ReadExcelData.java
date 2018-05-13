package April_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	@Test(dataProvider = "getData")
	public void TestLogin(String Runmode,String cool1,String col2){
		
	}
	
    @DataProvider
	public Object[][] getData() {
		Xls_Reader xls = new Xls_Reader("C:\\Users\\ti01045\\Desktop\\ReadTestData.xlsx");
		String TestCaseName = "TestC";
		String SheetName = "TestData";
		int TestCaseStart = 1;
		 while(!xls.getCellData(SheetName, 0, TestCaseStart).equals(TestCaseName)){
			 TestCaseStart++;
		 }
		 System.out.println("Test Start number -- > " + TestCaseStart);
		 
		 int ColNumber = TestCaseStart+1;
		 int RowNumber = TestCaseStart+2;
		 int row =0;
		 while(!xls.getCellData(SheetName, 0, RowNumber+row).equals("")){
			 row++;
		 }
		 System.out.println("Total number of row --- > " + row);
		 
		 int col=0;
		 while(!xls.getCellData(SheetName, col, ColNumber).equals("")){
			 col++;
		 }
		 System.out.println("Total number  of Col --- > " + col);
		 Object[][] data = new Object[row][col];
		int RowData=0;
		 for(int r=RowNumber;r<RowNumber+row;r++){
			 
			 for(int c=0;c<col;c++){
				 data[RowData][c] =xls.getCellData(SheetName, c, r);
			}
			 RowData++;
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
				if(runmode.equals("Y")){
					return true;
				}else return false;
			}
		}
		return false;
	}

}
