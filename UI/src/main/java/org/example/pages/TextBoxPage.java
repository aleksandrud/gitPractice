package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class TextBoxPage extends BasePage{

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    public WebElement userAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement userPermanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(id = "name")
    public WebElement expectedName;

    @FindBy(id = "email")
    public WebElement expectedEmail;

    @FindBy(xpath = "//p[@id='currentAddress']")
    public WebElement expectedAddress;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement expectedPermanentAddress;


    public TextBoxPage fillUpTheFullName(String FullName){
        elementActions.writeText(fullNameInput, FullName);
        return this;
    }
    public TextBoxPage fillUpTheEmail(String email){
        elementActions.writeText(userEmailInput, email);
        return this;
    }
    public TextBoxPage fillUpTheAddress(String currentAddress){
        elementActions.writeText(userAddressInput, currentAddress);
        return this;
    }
    public TextBoxPage fillUpThePermanentAddress (String permanentAddress){
        elementActions.writeText(userPermanentAddressInput, permanentAddress);
        return this;
    }
    public TextBoxPage clickSubmit(){
        elementActions.scrollToTheElement(submitBtn)
                .clickTheButton(submitBtn);
        return this;
    }
    public  TextBoxPage testTextBoxPage(){

        Assert.assertTrue(expectedName.getText().contains(fullNameInput.getText()));
        Assert.assertTrue(expectedEmail.getText().contains(userEmailInput.getText()));
        Assert.assertTrue(expectedAddress.getText().contains(userAddressInput.getText()));
        Assert.assertTrue(expectedPermanentAddress.getText().contains(userPermanentAddressInput.getText()));
        return this;
    }



}
