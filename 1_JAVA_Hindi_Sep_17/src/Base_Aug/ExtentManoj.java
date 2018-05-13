package Base_Aug;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManoj {
	public static ExtentReports ext;
	public static ExtentReports manojReport(){
		if(ext==null){
			Date d = new Date();
			String reportName = d.toString().replace(" ", "_").replace(":", "_")+".html";
			ext = new ExtentReports("D://report//"+reportName,true,DisplayOrder.NEWEST_FIRST);
			//ext.loadConfig(new File(System.getProperty("user.dir")+"//report-config.xml"));
			ext.addSystemInfo("Selenium Version", "2.53.0").addSystemInfo(
					"Environment", "QA");
			}
		return ext;
	}

}
