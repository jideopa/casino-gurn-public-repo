package com.casinoguru.pages;

import com.casinoguru.base.CasinoBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage extends CasinoBase {
    @FindBy(css = ".email")
    public WebElement profileIconButton;
    @FindBy(css = "div:nth-of-type(2) > .profile-panel-edit > label")
   public WebElement editButton;

    @FindBy(css = "input#passwordOld")
   public WebElement oldPasswordField;

    @FindBy(css = "[aria-hidden='false'] .my-s:nth-of-type(3) [type]")
  public   WebElement confirmPassword;

    @FindBy(css = "[aria-hidden='false'] .my-s:nth-of-type(2) [type]")
  public   WebElement newPasswordField ;

    @FindBy(css="div#profilePasswordModal  div[role='dialog']  form  .btn.btn-green.btn-width-s.js-login-submit")
  public   WebElement changePasswordButton;

    @FindBy(css= ".cg-input-label-error.text-left > span")
    public WebElement incorrectPasswordIsDisplay;
   public  ChangePasswordPage(){
        PageFactory.initElements(driver, this);
    }






}
