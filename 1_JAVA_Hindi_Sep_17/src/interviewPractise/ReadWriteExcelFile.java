package interviewPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelFile {

	public static void main(String[] args) throws IOException {
		File src=new File("C:\\Users\\ti01045\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("data");
		String data=sh.getRow(3).getCell(3).getStringCellValue();
		System.out.println(data);
		//Write the String in Excel---
		FileOutputStream fos=new FileOutputStream(src);
		sh.createRow(10).createCell(5).setCellValue("Manoj Sarita");
		wb.write(fos);
		fos.close();
		System.out.println("Writing Done -- Manoj Sarita");
	}

}
