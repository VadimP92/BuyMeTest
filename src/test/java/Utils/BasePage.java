package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public void clickElement(By locator) throws Exception { // function for clicking an element
           getWebElement(locator).click();

    }

    private WebElement getWebElement(By locator) throws Exception { // function to get the driver
        return TestSIngelton.getDriverInstance().findElement(locator);
    }


    public void sendKeysToElement(By locator , String text) throws Exception {
        getWebElement(locator).sendKeys();



    }


    }



//
//    public void clickElement(By locator) {
//        getWebElement(locator).click();
//    }
//
//    private WebElement getWebElement(By locator) {
//        getWebElement(locator).click();
//    }




