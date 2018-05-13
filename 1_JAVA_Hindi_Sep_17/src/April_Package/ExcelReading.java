package April_Package;

public class ExcelReading {

	public static void main(String[] args) {
		Xls_Reader xls= new Xls_Reader("C:\\Users\\ti01045\\Desktop\\ReadTestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		System.out.println(rowCount);
		int ColCount = xls.getColumnCount("Sheet1");
		System.out.println(ColCount);
		System.out.println(xls.getCellData("Sheet1", 2, 3));	
		
		xls.setCellData("Sheet1", "User", 20, "M");
		
	    String SheetName = "TestData";
	    String TestCaseName = "TestB";
	    int testStartrow =1;
        while(!xls.getCellData(SheetName, 0, testStartrow).equals(TestCaseName)){
        	testStartrow++;
        }
        System.out.println("Test Start Row number -- >  " + testStartrow);
        int colNo = testStartrow+1;
        int rowNo = testStartrow+2;
        int row=0;
        while(!xls.getCellData(SheetName, 0, rowNo+row).equals("")){
        	row++;
        }
        System.out.println("Total Row Start number -- " + row);
        
        int col=0;
        while(!xls.getCellData(SheetName, col, colNo).equals("")){
        	col++;
        }
        System.out.println("Total Col of test -- " + col);
        for(int r=rowNo;r<rowNo+row;r++){
        	for(int c=0;c<col;c++){
        		System.out.print(xls.getCellData(SheetName, c, r)+" | ");
        	}
        	System.out.println("");
        }
  	}
}
