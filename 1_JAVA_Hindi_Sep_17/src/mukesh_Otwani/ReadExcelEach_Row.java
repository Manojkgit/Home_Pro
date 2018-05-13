package mukesh_Otwani;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelEach_Row {
   public static XSSFWorkbook wb;
   public static  XSSFSheet sheet; 
   public static void main(String[] args) throws Exception {
		 File src=new File("D://report//TestData.xlsx");
         FileInputStream fis=new FileInputStream(src);
    			 wb=new XSSFWorkbook(fis);
    			 sheet=wb.getSheet("data_1");	
    	
        ExcelUtil exe=new ExcelUtil("");
       System.out.println(exe.getData("data_1", 1, 1));	
    		
  }
}
