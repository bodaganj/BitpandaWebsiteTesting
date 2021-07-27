package com.bitpanda.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php?")
@NamedUrls(@NamedUrl(name = "productId", url = "http://automationpractice.com/index.php?id_product={1}&controller=product"))
public class ProductPage extends AbstractPage {

   @FindBy(xpath = ".//button[@name='Submit']")
   private WebElementFacade addToCartButton;

   @FindBy(xpath = ".//*[contains(@class,'layer_cart_product')]")
   private WebElementFacade addedToCartPanel;

   public ProductPage(final WebDriver webDriver) {
      super(webDriver);
   }

   public void clickAddToCartButton() {
      addToCartButton.waitUntilClickable();
      addToCartButton.click();
      addedToCartPanel.waitUntilVisible();
   }
}
