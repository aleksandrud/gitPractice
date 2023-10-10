package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Menu extends BaseTest{
    @Test
    void menu1() throws InterruptedException {
        driver.get("https://demoqa.com/menu#");
        WebElement menuItem1 = driver.findElement(By.xpath("(//a[@href='#'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuItem1).perform();
        Thread.sleep(3000);

        WebElement menuItem2 = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
        actions.moveToElement(menuItem2).perform();
        Thread.sleep(3000);


        WebElement menuItem22 = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
        actions.moveToElement(menuItem22).perform();
        Thread.sleep(3000);

        WebElement subItem1 = driver.findElement(By.xpath("(//a[@href='#'])[3]"));
        actions.moveToElement(subItem1).perform();
        Thread.sleep(3000);

        WebElement subItem2 = driver.findElement(By.xpath("(//a[@href='#'])[4]"));
        actions.moveToElement(subItem2).perform();
        Thread.sleep(3000);

        WebElement subList = driver.findElement(By.xpath("(//a[@href='#'])[5]"));
        actions.moveToElement(subList).perform();
        Thread.sleep(3000);

        WebElement subList1 = driver.findElement(By.xpath("(//a[@href='#'])[6]"));
        actions.moveToElement(subList1).perform();
        Thread.sleep(3000);

        WebElement subList2 = driver.findElement(By.xpath("(//a[@href='#'])[7]"));
        actions.moveToElement(subList2).perform();
        Thread.sleep(3000);

        WebElement menuItem3 = driver.findElement(By.xpath("(//a[@href='#'])[8]"));
        actions.moveToElement(menuItem3).perform();
        Thread.sleep(3000);




    }
}
