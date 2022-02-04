import Utils.Report;
import Utils.TestSIngelton;
import WebSiteScreens.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {
    private static ExtentReports reports = new ExtentReports();
    private static ExtentTest test = reports.createTest("BuyMeTest in Selenium", "Automation test for BuyMe website");

    @BeforeClass
    public static void be4Test() throws Exception {
     TestSIngelton.getDriverInstance();
TestSIngelton.getUrl();
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C://Users//extent.html");
            reports.attachReporter(htmlReporter);
    }

  /// THIS TEST TO CHECK REGISTER PROCESS //////
//    @Test(priority = 0)
//    public void signUpTest() throws Exception {
//       new LogInRegisterScreen().firstScreen();
////
//        new LogInRegisterScreen().SignUpRegisterElement();
//        new LogInRegisterScreen().RegisterElement();
//        new LogInRegisterScreen().firstNameElement();
//    new LogInRegisterScreen().emailElement();
//    new LogInRegisterScreen().passwordElement();
//    new LogInRegisterScreen().passwordConfirmElement();
//    new LogInRegisterScreen().registerButtonElement();
//
//
//    }


    //// THIS TEST TO LOGING AFTER REGISTRATION ///

    @Test(priority = 1)
    public void logInTest() throws Exception {
        new LogInRegisterScreen().SignUpRegisterElement();
        new LoginScreen().loginScreen();
        reports.attachReporter();
    }

/////  THIS TEST TO CHECK LIST PROCESS AND SELECT FROM CATEGORY'S  /////

@Test(priority = 2)
public void homeScreenTest() throws Exception{  // Test to find and fill the boxes of category's and search for a
        Thread.sleep(2000);
    new HomeScreen().homeChoice();
    new PicBuisnessScreen().picBuisness();
        reports.attachReporter();
}

    //// THIS TEST TO SUBMIT DETAILS FOR THE GIFT ////
@Test(priority = 3)
public void givingGiftTest() throws Exception{
        new SenderAndReciverScreen().senderAndReciver();
}



    @AfterClass
    public static void afterClass(){
        reports.flush();
    }

}