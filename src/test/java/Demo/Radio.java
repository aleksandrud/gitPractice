package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Radio extends BaseTest{
    @Test
    void yes(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesBtn = driver.findElement(By.id("yesRadio"));
        Actions actions = new Actions(driver);
        actions.click(yesBtn).perform();

        WebElement yesText = driver.findElement(By.xpath("//span[@class ='text-success']"));
        Assert.assertTrue(yesText.getText().contains("Yes"));

        WebElement impressiveBtn = driver.findElement(By.id("impressiveRadio"));
        actions.click(impressiveBtn).perform();

        WebElement impressiveText = driver.findElement(By.xpath("//span[@class ='text-success']"));
        Assert.assertTrue(impressiveText.getText().contains("Impressive"));

    }
}
