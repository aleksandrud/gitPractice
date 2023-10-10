package org.example;

import lombok.Builder;
import org.example.driver.ChromeWebDriver;
import org.example.driver.Driver;
import org.example.helper.AlertHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class main {


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    void test1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();


        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();


        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();


        driver.findElement(By.id("promtButton")).click();
        alert.sendKeys("sasha");
        alert.accept();


    }

    @Test
    public void testToAlert() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();
    }

    @Test
    void test2() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }

    @Test
    void test3() {
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1"); // переключает на родитяля frame
        driver.switchTo().frame(0); // переключает на child frame
        WebElement text = driver.findElement(By.tagName("p"));
        System.out.println(text.getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
    }

    @Test
    void test4() {
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1"); // переключает на родитяля frame
        driver.switchTo().frame(0); // переключает на child frame
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"Child Iframe");

    }
}