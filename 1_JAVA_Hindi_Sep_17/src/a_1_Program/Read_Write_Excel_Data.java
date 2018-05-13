package a_1_Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write_Excel_Data {

	public static void main(String[] args) throws IOException {
		File src = new File("D://report//TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("data");
		String d1=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(d1);
		sheet.createRow(5).createCell(5).setCellValue("Kushwaha");		
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		fos.flush();
	}
}
