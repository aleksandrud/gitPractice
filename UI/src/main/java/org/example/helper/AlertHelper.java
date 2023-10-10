package org.example.helper;

import lombok.Data;
import org.example.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@Data

public class AlertHelper {
    Alert alert;

    public AlertHelper acceptAlert() {
        switchToAlert().waitAlertToBePresent();
        alert.accept();
        return this;
    }
    public AlertHelper disMisAlert() {
        switchToAlert().waitAlertToBePresent();
        alert.dismiss();
        return this;
    }
    public AlertHelper sendKeysAlert(String txt) {
        switchToAlert().waitAlertToBePresent();
        alert.sendKeys(txt);
        alert.accept();
        return this;
    }
    public AlertHelper switchToAlert(){
        alert = Driver.getDriver().switchTo().alert();
        return this;
    }
    public AlertHelper waitAlertToBePresent(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        return this;
    }
}