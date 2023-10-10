package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NambaFood extends BaseTest{



    @Test
    void orderingFood(){
        driver.get("https://nambafood.kg/");

        WebElement clickFood = driver.findElement(By.linkText("Еда"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",clickFood);


        WebElement kitchen = driver.findElement(By.xpath("html/body/div[2]/main/section[3]/div/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", kitchen);
        kitchen.click();

        WebElement cafe = driver.findElement(By.xpath("//div[@class='catalog-wrap']/a[19]"));
        cafe.click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", cafe);
        //   "html/body/main/section[3]/div[2]/div[2]/a[1]"

        WebElement plusBlin= driver.findElement(By.xpath("(//div[@class='count-button count-up'])[1]"));
        plusBlin.click();
        plusBlin.click();

        WebElement orderBlin =driver.findElement(By.xpath("//div[@data-item-id='114588']/button"));
        orderBlin.click();

        WebElement plusKasha= driver.findElement(By.xpath("(//div[@class='count-button count-up'])[5]"));
        plusKasha.click();
        plusKasha.click();
        WebElement orderKasha= driver.findElement(By.xpath("//div[@data-item-id='114593']/button"));
        orderKasha.click();

        WebElement cola= driver.findElement(By.xpath("//div[@data-item-id='18556']/div[2]/div[2]"));
        cola.click();
        cola.click();
        WebElement orderCola= driver.findElement(By.xpath("//div[@data-item-id='18556']/button"));
        orderCola.click();


        WebElement chek = driver.findElement(By.id("cart"));
        chek.click();

        WebElement oformZakaz = driver.findElement(By.xpath("//a[@href='/arabesk/checkout']"));
        oformZakaz.click();

        WebElement fullName =driver.findElement(By.id("food_order_client_name"));
        String expectedFullName = "Will Smith";
        fullName.sendKeys(expectedFullName);

        WebElement address =driver.findElement(By.id("food_order_address"));
        String expectedAddress="10 мкр дом 10 кв 5";
        address.sendKeys(expectedAddress);

        WebElement numberField = driver.findElement(By.id("food_order_phone"));
        String expectedNumber = "552121314";
        numberField.sendKeys(expectedNumber);

        WebElement checkField = driver.findElement(By.id("food_order_money_change"));
        String expectedCheck = "5000";
        checkField.sendKeys(expectedCheck);


    }
}
