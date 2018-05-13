package Base_prectice16Apr17;

import java.util.Hashtable;

public class DataUtil_ZZ {

	public static Object[][] getTestData(Xls_Reader x, String TestCaseName) {
	    String SheetName="TestData";
		int testStartRow =1;
		while(!x.getCellData(SheetName, 0, testStartRow).equals(TestCaseName)){
			testStartRow++;
		}
		System.out.println("test Start Row -- > " + testStartRow);
		int RowNumber = testStartRow+2;
		int colNumber = testStartRow+1;
		int row=0;
		while(!x.getCellData(SheetName, 0, RowNumber+row).equals("")){
			row++;
		}
		System.out.println("Test Row Start -- And Total -- > " + row);

		int col=0;
		while(!x.getCellData(SheetName, col, colNumber).equals("")){
			col++;
		}
		System.out.println("Test Col Start -- And Total -- > " + col);
		Object[][] data = new Object[row][1];
		int DataRow=0;
		Hashtable<String,String> table = null;
		for(int r=RowNumber;r<RowNumber+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = x.getCellData(SheetName, c, colNumber);
				String value = x.getCellData(SheetName, c, r);
				table.put(key, value);
			}
			data[DataRow][0]=table;
			DataRow++;
		}
		return data;
	}

	public static boolean isRunable(String testCase, Xls_Reader xls){
        String sheetName = "TestCase";
        int row= xls.getRowCount(sheetName);
        for(int r=2;r<=row;r++){
        	String tname = xls.getCellData(sheetName, "TestCaseID", r);
        	if(tname.equals(testCase)){
        		String runmode = xls.getCellData(sheetName, "Runmode", r);
        	if(runmode.equals("Y")){
        		return true;
        	}else return false;
        	}
        }
        return false;
	}
}
