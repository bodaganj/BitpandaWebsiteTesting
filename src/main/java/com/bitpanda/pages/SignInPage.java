package com.bitpanda.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class SignInPage extends AbstractPage {

   @FindBy(xpath = ".//*[@id='email']")
   private WebElementFacade emailAddressField;

   @FindBy(xpath = ".//*[@type='password']")
   private WebElementFacade passwordField;

   @FindBy(xpath = ".//*[@id='SubmitLogin']")
   private WebElementFacade signInButton;

   @FindBy(xpath = ".//*[@class='alert alert-danger']")
   private WebElementFacade authAlert;

   public SignInPage(WebDriver webDriver) {
      super(webDriver);
   }

   public void signInWithCredentials(final String email, final String password) {
      emailAddressField.type(email);
      passwordField.type(password);
      signInButton.click();
   }

   public boolean isAuthAlertVisible() {
      return authAlert.isVisible();
   }
}
