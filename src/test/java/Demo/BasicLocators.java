package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocators extends BaseTest{



    @Test
    void  byIdTest(){
        driver.get("https://demoqa.com/text-box");
        WebElement userName =driver.findElement(By.id("userName"));
        System.out.println(userName.getText());
    }

    @Test
    void byTagName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byTag = driver.findElement(By.tagName("h5"));
        System.out.println(byTag.getText());
    }

    @Test
     void byClassName (){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byClass = driver.findElement(By.className("main-header"));
        System.out.println(byClass.getText());
    }
    @Test
    void linkedText(){
        driver.get("https://demoqa.com/links");
        WebElement linkedText = driver.findElement(By.linkText("Home"));
        System.out.println(linkedText.getText());

    }
    @Test
    void  partialLinkedText(){
        driver.get("https://demoqa.com/links");
        WebElement partialLinked = driver.findElement(By.partialLinkText("Bad"));
        System.out.println(partialLinked.getText());
    }
    @Test
    void byName(){
        driver.get("https://accounts.lambdatest.com/login");
        WebElement byName = driver.findElement(By.name("password"));
        System.out.println(byName.getText());
    }
}
