package WebSiteScreens;

import Utils.BasePage;
import Utils.Report;
import Utils.TestSIngelton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SenderAndReciverScreen extends BasePage {
    private static WebDriver driver;
    private static String reciverRealName= "Johny Bravo";
    private static String giverName= "Vadim The Great"; // due to the fact i already registers to BuyMe,it fills my name automatically and on assert test comes up as "Actual: vadim Vadim The Great",it prints vadim

    public void senderAndReciver() throws Exception {
        driver= TestSIngelton.getDriverInstance();
        reciverName();
        choseCelebration();
        enterBleesing();
        nextButton();
        smsGift();
        enterSms();
        giftGiverName();
        reciverPhoneNum();
        procedToPayment();
        choosePayment();
        Report.takePicture();
    }
    public void reciverName()throws Exception{
//        Assert.assertEquals(driver.findElement(By.xpath("//form/div[2]/div[1]/label/input")).getAttribute("value") , reciverRealName);
//        sendKeysToElement(By.xpath("//form/div[2]/div[1]/label/input"),"Johny Bravo");
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div[2]/div[1]/label/input"))).clear();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div[2]/div[1]/label/input"))).sendKeys("Johny Bravo");
        Assert.assertEquals(driver.findElement(By.xpath("//form/div[2]/div[1]/label/input")).getAttribute("value") , reciverRealName);
    }
    public void choseCelebration()throws Exception{
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div[2]/div[2]/label/div/div[1]/span"))).click();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div[2]/div[2]/label/div/div[2]/ul/li[2]"))).click();
    }

    public void enterBleesing()throws Exception{
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]/label/textarea"))).clear();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]/label/textarea"))).sendKeys("HAPPYBIRTH DAY!!!");

    }
    public void nextButton()throws Exception{
        clickElement(By.xpath("//div/div[1]/form/div[3]/div[2]/button"));
    }
    public void smsGift()throws Exception{
        clickElement(By.xpath("//form/div[2]/div[3]/div/div[1]"));

    }
    public void enterSms()throws Exception{
        Thread.sleep(1000);
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.id("sms"))).clear();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.id("sms"))).sendKeys("0546303567");
    }
    public void giftGiverName()throws Exception{
        Thread.sleep(1000);
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[2]/label/input"))).clear();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[2]/label/input"))).sendKeys("Vadim The Great");
        Assert.assertEquals(driver.findElement(By.xpath("//div[3]/div[2]/label/input")).getAttribute("value"), giverName);
    }
    public void reciverPhoneNum()throws Exception{
        Thread.sleep(1000);
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[3]/label/input"))).clear();
        TestSIngelton.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[3]/label/input"))).sendKeys("0546303567");
    }
    public void procedToPayment()throws Exception{
        clickElement(By.xpath("//form/div[4]/div[2]/button"));
    }

    public void choosePayment()throws Exception{
        clickElement(By.xpath("//div[1]/div[3]/div/div[2]/span"));
    }

}
