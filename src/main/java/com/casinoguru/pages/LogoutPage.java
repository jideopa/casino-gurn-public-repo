package com.casinoguru.pages;

import com.casinoguru.base.CasinoBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends CasinoBase {

    @FindBy(css = ".email")
    public WebElement DropButton;

    @FindBy(css = ".js-menu-login-popup.menu-expandable-popup.menu-expandable-user.menu-expandable-user-narrow.menu-user-logged > a:nth-of-type(6)")
    public WebElement LogoutButton;

    @FindBy(css = ".js-menu-lang.menu-lang.menu-right-btn > span")
    public WebElement LanguageButton;

    public LogoutPage(){
        PageFactory.initElements(driver,this);
    }
}
