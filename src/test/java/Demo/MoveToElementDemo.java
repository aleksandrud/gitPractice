package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElementDemo extends BaseTest {
    @Test
    void demo1234() {

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        String expectedFullName = "John Doe";
        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));
        String expectedEmail = "john@gmail.com";
        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        String expectedCurrentAdd = "Bishkek123";
        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        String expectedPermanentAddress = "WallStreet123";
        permanentAddress.sendKeys(expectedPermanentAddress);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();
    }
}