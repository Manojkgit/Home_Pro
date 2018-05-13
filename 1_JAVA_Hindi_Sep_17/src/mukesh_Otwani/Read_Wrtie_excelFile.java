package mukesh_Otwani;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Wrtie_excelFile {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\ti01045\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("data");
		String data=sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);

		sheet.createRow(6).createCell(2).setCellValue("Manavi Viraj");
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		fos.close();
	}

}
