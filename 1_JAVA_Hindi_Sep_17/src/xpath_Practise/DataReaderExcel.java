package xpath_Practise;

import java.util.Hashtable;
import April_Package.Xls_Reader;

public class DataReaderExcel {

	public static Object[][] getDataFromExcel(Xls_Reader xls,String testCase){
		String sheetName="data";
		int testStart=1;
		while(!xls.getCellData(sheetName, 0, testStart).equals(testCase)){
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
		
		Hashtable<String,String> table=null;
		int DataRow =0;
		Object[][] data = new Object[row][1];
		for(int r=rowStart;r<rowStart+row;r++){
			table =new Hashtable<String,String>();
			for(int c=0;c<=col;c++){
				String key = xls.getCellData(sheetName, c,  colStart);
				String value = xls.getCellData(sheetName, c,  r);
				table.put(key, value);
			}
			data[DataRow][0]=table;
			DataRow++;
		}
            return data;
	}
	
	
	public static boolean isTestCaseRunMode(Xls_Reader xls,String testCaseName){
		String sheetName ="Cases";
		int rowCount = xls.getRowCount(sheetName);
        for(int r=2;r<=rowCount;r++){
        	String tName = xls.getCellData(sheetName, "TCID", r);
        	if(tName.equals(testCaseName)){
        		String runmode = xls.getCellData(sheetName, "Runmode", r);
        			if(runmode.equals("Y")){
        				return false;
        			}else{
        				return true;
        			}
        		}

        	}
		return true;
        }
	}

