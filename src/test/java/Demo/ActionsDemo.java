package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest{
    @Test
    void demo123(){
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton =driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleClickText =driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        Assert.assertEquals(doubleClickText.getText(),"You have done a double click");




        WebElement rightClickButton =driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();
        WebElement rightClickText  =driver.findElement(By.xpath("//p[text()='You have done a right click']"));
        Assert.assertEquals( rightClickText.getText(),"You have done a right click");




        WebElement clickButton =driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickButton).perform();
        WebElement clickText  =driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
        Assert.assertEquals( clickText.getText(),"You have done a dynamic click");


    }
}
