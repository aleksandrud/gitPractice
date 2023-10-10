package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBox extends BaseTest{

    @Test
    void fillUpTheFormTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField =driver.findElement(By.id("userName"));
        String expectedFullName = "John Doe";
        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField =driver.findElement(By.id("userEmail"));
        String expectedEmail ="johndoe@mail.com";
       emailField.sendKeys(expectedEmail);

        WebElement currentAddressField =driver.findElement(By.id("currentAddress"));
        String expectedCurrent = "Bishkek";
        currentAddressField.sendKeys(expectedCurrent);

        WebElement permanentAddressField =driver.findElement(By.id("permanentAddress"));
        String expectedPermanent = "Bishkek";
        permanentAddressField.sendKeys(expectedPermanent);


        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();

        Thread.sleep(5000);


       WebElement resultName =driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrent));


        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains(expectedPermanent));


    }
}
