package Utils;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.Utils;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.Duration;

public class TestSIngelton {

    private static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriverInstance() throws Exception {

        if (driver == null) {
            Report.beforeAll();
            String type = getData("browserType");
            if (type.equals("Chrome")) {
                try {

                    System.setProperty("webdriver.chrome.driver", Constant.CHROMEDRIVER_PATH);
                    driver = new ChromeDriver();
                    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    Report.test.log(Status.PASS, "Driver established successfully");


                } catch (Exception e) {
                    e.printStackTrace();
                    Report.test.log(Status.FAIL, "Driver connection failed! " + e.getMessage());
                    throw new Exception("Driver failed");
                }
            }
        }
        return driver;
    }
    public static void getUrl() throws Exception {
        String URL = getData("URL");
        driver.get(URL);
        driver.manage().window().maximize();
    }



    public static String getData (String keyName) throws Exception{
        ClassLoader classLoader = TestSIngelton.class.getClassLoader();
        String xmlFilePath = String.valueOf(new File("C:\\Users\\kriss\\IdeaProjects\\BuyMeTest\\src\\main\\resources\\data.xml"));
        File fXmlFile = new File(xmlFilePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

}








    ///////////



//    public static WebDriver driver;
//
//    public static WebDriver getDriverInstance() throws Exception {
//        if (driver == null) {
//            Report.beforeAll();
//            System.setProperty("webdriver.chrome.driver", Constant.CHROMEDRIVER_PATH); /// gets the path from the Chrome driver
//            driver = new ChromeDriver();
//            Report.test.log(Status.PASS, "Driver established successfully");
//
//        }
//
//        return driver;
//
//    }
//
//    private static String getData(String keyName) throws Exception {
//        ClassLoader classLoader = TestSIngelton.class.getClassLoader();
//        String xmlFilePath = String.valueOf(new File(classLoader.getResource("data.xml").getFile()));
//        File fXmlFile = new File(xmlFilePath);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(fXmlFile);
//        doc.getDocumentElement().normalize();
//        return doc.getElementsByTagName(keyName).item(0).getTextContent();
//
//    }
//}

////////////////

//    public static WebDriver driver;
//
//    public static WebDriver getDriverInstance() throws Exception{
//        if (driver==null){
//            Report.beforeAll();
//            String type=getData("browserType");
//            if (type.equals("Chrome")){
//                try {
//                    System.setProperty("webdriver.chrome.driver" , Constant.CHROMEDRIVER_PATH); /// gets the path from the Chrome driver
//                    driver= new ChromeDriver();
//                    Report.test.log(Status.PASS,"Driver established successfully");
//                }catch (Exception e){
//                    e.printStackTrace();
//                    Report.test.log(Status.FAIL, "Driver connection failed" +e.getMessage());
//                    throw new Exception("Driver Failed");
//                }
//            }
//        }
//
//
////                    System.setProperty("webdriver.chrome.driver" , Constant.CHROMEDRIVER_PATH); /// gets the path from the Chrome driver
////                    driver= new ChromeDriver();
////                    Report.test.log(Status.PASS,"Driver established successfully");
//
//        return driver;
//    }
//
//
//
//
//
//    private static String getData (String keyName) throws Exception{
//        ClassLoader classLoader = TestSIngelton.class.getClassLoader();
//        String xmlFilePath = String.valueOf(new File(classLoader.getResource("data.xml").getFile()));
//        File fXmlFile = new File(xmlFilePath);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(fXmlFile);
//        doc.getDocumentElement().normalize();
//        return doc.getElementsByTagName(keyName).item(0).getTextContent();
//
//    }