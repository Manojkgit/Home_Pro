package mukesh_Otwani;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public ExcelUtil(String excelPath){
		 try{
			 File src=new File(excelPath);
			 FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
			 sheet=wb.getSheet("data_1");	
		 }
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
	
	}
	
	public String getData(String sheetName,int row,int col){
		String d=sheet.getRow(row).getCell(col).getStringCellValue();
		return d;
	}

}
