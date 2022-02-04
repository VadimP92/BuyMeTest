package WebSiteScreens;

import Utils.BasePage;
import Utils.Report;
import Utils.TestSIngelton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PicBuisnessScreen extends BasePage {
    private static WebDriver driver;


    private static String webSiteUrl = "https://buyme.co.il/search?budget=1&category=204&query=%D7%90%D7%95%D7%9B%D7%9C&region=13";

    public PicBuisnessScreen() throws Exception {
        driver = TestSIngelton.getDriverInstance();
    }

    public void assertURL() throws Exception {
        String pageURL = driver.getCurrentUrl();
        Assert.assertEquals(pageURL, webSiteUrl);
    }

    public void picBuisness() throws Exception { // after the filters are checked this function will pick the business
//    clickElement(By.xpath("//div[2]/div[1]/div/ul/div[2]/a/div/div[4]"));
//    clickElement(By.className("bottom"));
//        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/ul/div[2]/a/div/div[4]"))).click();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("OKINAWA"))).click();
        assertURL();
        choosePrice();
        Report.takePicture();


    }

    public void choosePrice()throws Exception{
//        sendKeysToElement(By.xpath("//div[3]/form/div[1]/label/input"),"300");
//        sendKeysToElement(By.cssSelector("input[id=ember1839]"),"300");
//        sendKeysToElement(By.linkText("הכנס סכום"),"300");
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/form/div[1]/label/input"))).sendKeys("300");
        clickElement(By.xpath("//div[3]/form/div[2]/button"));
    }
}