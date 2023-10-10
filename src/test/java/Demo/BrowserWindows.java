package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class BrowserWindows extends BaseTest{

    @Test
    public void windowsTest() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("tabButton")))
                .click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().window(tabs.get(1));

        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(3000);
        Assert.assertEquals(sample .getText(),"This is a sample page");
        Thread.sleep(3000);
    }

    @ Test
    void newWindowTest() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("windowButton")))
                .click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().window(tabs.get(1));

        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(3000);
        Assert.assertEquals(sample .getText(),"This is a sample page");
        Thread.sleep(3000);

    }
    @ Test
    void newWindowMess() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("messageWindowButton")))
                .click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement sample = driver.findElement(By.id("/html/body"));

        Assert.assertTrue(sample .getText().contains("sharing"));


    }
}
