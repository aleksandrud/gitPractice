package Demo;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class dynamicProperties extends BaseTest {

//    @FindBy(id = "enableAfter")
//    public WebElement enableAfter;
//
//    @FindBy(xpath = "//button[id='colorChange']")
//    public WebElement colorChange;
//
//    @FindBy(id = "visibleAfter")
//    public WebElement visibleAfter;

//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
//
//    public dynamicProperties clickAfter5 (WebElement enableAfter){
//        wait.until(ExpectedConditions.elementToBeClickable(enableAfter)).click();
//        return this;
//    }
//
//
//    public dynamicProperties clickVisible (WebElement visibleAfter){
//        wait.until(ExpectedConditions.visibilityOf(visibleAfter)).click();
//        return this;
//    }

    @Test(priority = 1)
    public void clickClick() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")))
                .click();

        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void visibleA() throws InterruptedException {
        //driver.get("https://demoqa.com/dynamic-properties");
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
                .click();
        Thread.sleep(3000);
    }


}