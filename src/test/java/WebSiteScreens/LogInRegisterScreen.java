package WebSiteScreens;

import Utils.BasePage;
import Utils.TestSIngelton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInRegisterScreen extends BasePage {
    private static WebDriver driver;
    private static WebDriverWait wait;
//   private static final String FIRSTNAME= "ember1696";
//   private static String NAME = "vadim0";
public void firstScreen() throws Exception {
    SignUpRegisterElement();
    firstNameElement();
   RegisterElement();
   emailElement();
   passwordElement();
   passwordConfirmElement();
registerButtonElement();
}



    public LogInRegisterScreen() throws Exception {
        driver= TestSIngelton.getDriverInstance();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }


    public void SignUpRegisterElement() throws Exception {
//        driver.findElement(By.linkText("כניסה / הרשמה")).click();// finds the register log in and press it // alternative method to find the element
        clickElement(By.linkText("כניסה / הרשמה"));

    }
    public void RegisterElement() throws Exception {// constructor for the register  element
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/div[1]/span")).click(); // alternative method to find the element
        clickElement(By.xpath("//div/div/div[3]/div[1]/span"));
    }
    public void firstNameElement() throws Exception {
        driver.findElement(By.xpath("//div[3]/form/div[1]/label/input")).sendKeys("vadim");
//        clickElement(By.xpath("//div[3]/div[2]/div[3]/form/div[1]/label/input"));// constructor for the first name element
//        sendKeysToElement(By.xpath("//div[3]/div[2]/div[3]/form/div[1]/label/input"),"Vadim");

//                sendKeysToElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/div[2]/div[3]/form/div[1]/label/input"),"VadimPlotnikov");
//        sendKeysToElement(By.id("ember1696"),"Vadim Plotnikov");
//        driver.findElement(By.id("ember1696")).sendKeys("vadim");
//           sendKeysToElement(By.id(FIRSTNAME),NAME);

    }
    public void emailElement() throws Exception {

//        driver.findElement(By.cssSelector("input[placeholder=מייל]")).click();                              ////   ALTERNATIVE WAYS TO SEARCH FOR THE ELEMENT
//        driver.findElement(By.cssSelector("input[placeholder=מייל]")).sendKeys("wokinstorm@outlook.com");   ////
//sendKeysToElement(By.xpath("//div[3]/div[2]/div[3]/form/div[2]/label/input"),"Vadim@mail.com");
driver.findElement(By.xpath("//div[3]/div[2]/div[3]/form/div[2]/label/input")).sendKeys("vadim@mail.com");
    }

    public void passwordElement()throws Exception{
//    sendKeysToElement(By.name("valPass"),"Password123");
    driver.findElement(By.xpath("//div[2]/div[3]/form/div[3]/label/input")).sendKeys("password123");
    }

    public void passwordConfirmElement() throws Exception {

//    clickElement(By.id("ember1718"));
    driver.findElement(By.xpath("//div[3]/form/div[4]/label/input")).sendKeys("password123");
    }

    public void registerButtonElement() throws Exception{

//        clickElement(By.tagName("input"));
        clickElement(By.xpath("//button"));
    }

}


// NOTES FOR MY SELF ////
// Reherse from class 10 project how to crtate login page using translate class and POM test class to see how to make loginPAGE class.//
