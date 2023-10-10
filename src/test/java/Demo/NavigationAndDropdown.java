package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NavigationAndDropdown extends BaseTest{
    @Test
    void demo1() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);

    }

    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));
        Select select =new Select(selectColor);
        select.selectByVisibleText("Green");
        Thread.sleep(3000);

        select.selectByValue("4");
        Thread.sleep(3000);
        select.selectByIndex(7);
        Thread.sleep(3000);
    }
}
