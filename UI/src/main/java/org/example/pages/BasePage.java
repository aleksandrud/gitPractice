package org.example.pages;

import org.example.driver.Driver;
import org.example.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public  abstract class BasePage {

    ElementActions elementActions = new ElementActions();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
