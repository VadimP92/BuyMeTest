package WebSiteScreens;

import Utils.BasePage;
import Utils.Report;
import Utils.TestSIngelton;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeScreen extends BasePage {
    private static WebDriver driver;
    private static WebDriverWait wait;


public void homeChoice()throws Exception{
    pricePointElement();
    selectPriceElement();
    selectRegionElement();
    selectRegion();
    selectCatagory();
    choseCatagory();
    choseGift();
    searchForGift();
    Report.takePicture();
Report.test.log(Status.PASS,"Details entered successfully");
}


    public  void pricePointElement() throws Exception {
//        TestSIngelton.getDriverInstance();
clickElement(By.className("selected-name"));
    }
    public void selectPriceElement()throws Exception{
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/form/label[1]/div/div[2]/ul/li[2]/span"))).click(); // tries looking with ID/css/linktext/ xpath worked
//     wait.until(ExpectedConditions.elementToBeClickable(By.id("ember1158"))).click();
    }
    public void selectRegionElement()throws Exception{
//        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class=selected-name]"))).click();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/header/div[3]/div/div/form/label[2]/div/div[1]/span"))).click(); // same here,xpath found to be the only useful way i found to find the element

    }
    public void selectRegion()throws Exception{
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div/div/form/label[2]/div/div[2]/ul/li[2]/span"))).click();
    }
    public void selectCatagory()throws Exception{
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/form/label[3]/div/div[1]/span"))).click();
    }
    public void choseCatagory()throws Exception{
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/form/label[3]/div/div[2]/ul/li[3]/span"))).click();

    }
    public void choseGift()throws Exception{
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/header/div[3]/div/div/form/label[4]/input"))).sendKeys("אוכל");
    }
    public void searchForGift()throws Exception{
      clickElement(By.xpath("//div/header/div[3]/div/div/form/a"));
    }


}
