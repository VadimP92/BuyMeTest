package WebSiteScreens;

import Utils.BasePage;
import Utils.Report;
import Utils.TestSIngelton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginScreen extends BasePage {
    private static WebDriver driver;

    public void loginScreen() throws Exception {
        driver= TestSIngelton.getDriverInstance();
        enterEmail();
        enterPassword();
        enterSubmit();
        Report.takePicture();


    }
    private void enterEmail() throws Exception {
//        sendKeysToElement(By.xpath("//div[2]/div[3]/form/div[1]/label/input"),"wokinstorm@outlook.com");
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/form/div[1]/label/input"))).sendKeys("wokinstorm@outlook.com");
    }
private void enterPassword() throws Exception {
//        sendKeysToElement(By.xpath("//div[2]/div[3]/form/div[2]/label/input"),"Milana2007");
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/form/div[2]/label/input"))).sendKeys("Milana2007");
}
public void  enterSubmit()throws Exception{
        clickElement(By.xpath("//div[3]/div[2]/div[3]/form/button"));
}

}
