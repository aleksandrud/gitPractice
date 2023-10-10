package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathDemo extends BaseTest{
    @Test
    void absoluteXpath() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstNameInputFiled =driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
       firstNameInputFiled.sendKeys("Sasha");
        Thread.sleep(7000);
    }

    @Test
    void relativeXpath(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInputField.sendKeys("Yudenko");
    }

    @ Test
    void  emailRelativeXpath(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement emailRX = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        emailRX.sendKeys("sasha@mail.com");
    }
    @ Test
    void mobileNum(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement mobNum =driver.findElement(By.xpath("//*[@id='userNumber']"));
        mobNum.sendKeys("551291295");


        WebElement text =driver.findElement(By.xpath("//*[text()='Student Registration Form']"));

        WebElement containsText = driver.findElement(By.xpath("//*[contains(text(),'Student')]"));

        WebElement emailText =driver.findElement(By.xpath("//form/div[2]/div/label"));

        WebElement currentAddress = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]"));

        WebElement parent = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]/../.."));


    }

    @ Test
    void showText(){
        driver.get("https://www.amazon.com/s?k=iphone+15+pro+case+pelican&crid=27GH6RCZ7U3ML&sprefix=iphone+15+pro+case+pe%2Caps%2C384&ref=nb_sb_ss_ts-doa-p_1_21");
        WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Pelican Protector Series - iPhone 15 Pro Case 6.1\" [Compatible with MagSafe] [Anti-Yellow] Magnetic Phone Case with Anti-Scratch Tech [16FT MIL-Grade Drop Protection] Cover for iPhone 15 Pro - Clear')]"));
        System.out.println(text.getText());
    }

}
