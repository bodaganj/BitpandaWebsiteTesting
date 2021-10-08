package com.bitpanda.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@Getter
@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class SignInPage extends AbstractPage {

   @FindBy(xpath = ".//*[@id='email']")
   public WebElementFacade emailAddressField;

   @FindBy(xpath = ".//*[@type='password']")
   public WebElementFacade passwordField;

   @FindBy(xpath = ".//*[@id='SubmitLogin']")
   public WebElementFacade signInButton;

   @FindBy(xpath = ".//*[@class='alert alert-danger']")
   public WebElementFacade authAlert;

   public SignInPage(WebDriver webDriver) {
      super(webDriver);
   }
}
