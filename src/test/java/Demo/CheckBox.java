package Demo;

import Demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBox extends BaseTest {
    @Test
    void CheckTest() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");
        WebElement check = driver.findElement(By.xpath("//button[@aria-label='Expand all']"));
        check.click();
        Thread.sleep(7000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", check);

        List<WebElement> vybor = driver.findElements(By.xpath("//div[@id='tree-node']//span[@class='rct-checkbox']"));

        for (int i = 0; i < vybor.size(); i++) {
            if (i == 0 || i == 4 || i == 1 || i == 5 || i == 9 || i == 14) {
            } else {
                System.out.println(i);
                WebElement vybor1 = vybor.get(i);
                vybor1.click();
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", vybor1);


            }
        }
        WebElement containsText = driver.findElement(By.id("result"));
        String text = "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        System.out.println(containsText.getText());
        Assert.assertTrue(containsText.getText().contains(text));

    }
}
