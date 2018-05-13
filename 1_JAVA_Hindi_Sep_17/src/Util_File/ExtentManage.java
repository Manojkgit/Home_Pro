package Util_File;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentManage {
	public static ExtentReports ext;
	public static ExtentTest test;
	public static ExtentReports Ex_managerReporting(){
		if(ext == null);
		Date d = new Date();
		String reportName= d.toString().replace(":", "_").replace(" ", "_")+".html";
		ext = new ExtentReports("D://report//"+reportName,true,DisplayOrder.NEWEST_FIRST);
		ext.addSystemInfo("QA", "Kushwaha System");
		return ext;
				
		
	}

}
