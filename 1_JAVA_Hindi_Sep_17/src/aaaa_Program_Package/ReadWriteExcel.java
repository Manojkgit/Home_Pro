package aaaa_Program_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		File src =new File("C:\\Users\\ti01045\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("data");
        String data=sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	    sheet.createRow(10).createCell(4).setCellValue("Kushwaha"); 	
	    FileOutputStream fos=new FileOutputStream(src);
	    wb.write(fos);
	    fos.close();
	   
	}

}
