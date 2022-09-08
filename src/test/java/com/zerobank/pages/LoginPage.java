package com.zerobank.pages;

import com.zerobank.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement submitButton;

    public void login (String user, String pass){
        usernameInput.sendKeys(user);
        password.sendKeys(pass);
    }
}
