package April_Package;

import java.util.Hashtable;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashTableRead {
    @Test(dataProvider="getData")
    public void login(Hashtable<String,String>data){
    	System.out.println(data.get("Runmode")+ " | "+data.get("col1")+ " | "+data.get("col2"));
    }
	@DataProvider
	public Object[][] getData() {
		Xls_Reader x = new Xls_Reader("C:\\Users\\ti01045\\Desktop\\ReadTestData.xlsx");
	    String SheetName="TestData";
		String TestCaseName = "TestC";
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
		System.out.println("Test Row Start -- And TOtal -- > " + row);

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
}
