package zzzzzzz;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport_DDF {
    public static ExtentReports ext;
    public static ExtentReports extentReport(){
    	if(ext==null){
    		Date d=new Date();
    		String FN=d.toString().replace(":", "_").replace(" ", "_")+".html";
    		ext=new ExtentReports("D://report//"+FN,true,DisplayOrder.NEWEST_FIRST);
    		ext.addSystemInfo("QA", "Testing");
    	}
    	return ext;
    }
}
