package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Report {
    public static ExtentReports report;
    public static ExtentTest test;

public static void beforeAll() throws  Exception{
    String cwd = System.getProperty("User.dir");
    ExtentSparkReporter htmlReporter= new ExtentSparkReporter(cwd+"\\REPORT.HTML");
    report=new ExtentReports();
    report.attachReporter(htmlReporter);
    test = report.createTest("BuyMeTest", "BuyMe website test");
    test.log(Status.INFO,"@Before class");
}
public static String takeScreenShot(String ImagePath)throws Exception{  //   functions to take screenshot
    TakesScreenshot takesScreenshot=(TakesScreenshot)TestSIngelton.getDriverInstance();
    File screenShotFile =takesScreenshot.getScreenshotAs(OutputType.FILE);
File destinationFile =new File(ImagePath+".png");
  try {
      FileUtils.copyFile(screenShotFile, destinationFile);
  }catch (IOException e){
      System.out.println(e.getMessage());
  }
return ImagePath+".png";
}

public static void takePicture() throws Exception {
String timeNow= String.valueOf(System.currentTimeMillis());
test.pass("screenShot", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
takeScreenShot(timeNow);

}
}
