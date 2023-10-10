package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBox1 extends BaseTest {
    @Test
    void fillUpTheFormHomeWork() {

        driver.get( "https://demoqa.com/automation-practice-form");


        WebElement firstNameInputField =driver.findElement(By.id("firstName"));
        String expectedFirstName = "Sasha";
        firstNameInputField.sendKeys(expectedFirstName);


        WebElement lastNameInputField =driver.findElement(By.id("lastName"));
        String expectedLastName = "Yudenko";
        lastNameInputField.sendKeys(expectedLastName);

        WebElement emailField =driver.findElement(By.id("userEmail"));
        String expectedEmail ="sasha@mail.com";
        emailField.sendKeys(expectedEmail);

        WebElement clickGenderBtn = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", clickGenderBtn);


        WebElement numberField =driver.findElement(By.id("userNumber"));
        String expectedNumber ="0551291295";
        numberField.sendKeys(expectedNumber);



        WebElement dateOfB = driver.findElement(By.id("dateOfBirthInput"));



        WebElement objectField = driver.findElement(By.xpath("//input[@id ='subjectsInput']"));



        WebElement hobbyCheck1 = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-1']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", hobbyCheck1);


        WebElement pictureField = driver.findElement(By.xpath("//input[@id ='uploadPicture']"));



        WebElement currentAddressField =driver.findElement(By.id("currentAddress"));
        String expectedCurrent = "Bishkek";
        currentAddressField.sendKeys(expectedCurrent);
















    }
}
