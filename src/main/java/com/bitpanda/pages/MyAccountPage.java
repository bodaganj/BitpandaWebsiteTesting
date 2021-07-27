package com.bitpanda.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php?controller=my-account")
public class MyAccountPage extends AbstractPage {

   @FindBy(xpath = ".//*[@id='my-account']")
   private WebElementFacade myAccount;

   public MyAccountPage(WebDriver webDriver) {
      super(webDriver);
   }

   public boolean isMyAccountPageVisible() {
      return myAccount.isVisible();
   }
}
