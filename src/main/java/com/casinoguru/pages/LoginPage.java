package com.casinoguru.pages;

import com.casinoguru.base.CasinoBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CasinoBase {
    @FindBy(css = ".js-menu-right-login.menu-right-btn.menu-right-link > .text")
    public WebElement loginButton;
    @FindBy(css = "input#email2")
    public WebElement emailField;

    @FindBy(css = "input#password2")
    public WebElement passwordField;


    @FindBy(css = "[data-ga-id='general_login_btn_logIn']")
    public WebElement submitButton;

    @FindBy(css = ".email .avatar")
    public WebElement profileIcon;


    public LoginPage (){
        PageFactory.initElements(driver,this);
    }
}
