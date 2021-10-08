package com.bitpanda.pages;

import com.bitpanda.items.ShoppingCartProductItem;
import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
@DefaultUrl("http://automationpractice.com/index.php?controller=order")
public class ShoppingCartPage extends AbstractPage {

   private final String shoppingCartProductsXPath = ".//tr[contains(@id,'product')][contains(@class,'cart_item')]";

   @FindBy(xpath = ".//*[@class='alert alert-warning'][contains(text(),'Your shopping cart is empty.')]")
   public WebElementFacade emptyShoppingCart;

   @FindBy(xpath = ".//*[@id='order-detail-content']")
   public WebElementFacade shoppingCartSummary;

   public ShoppingCartPage(final WebDriver webDriver) {
      super(webDriver);
   }

   public List<ShoppingCartProductItem> getAllProductsWithinShoppingCart() {
      return getDataItemsFactory().getElementsNamed(ShoppingCartProductItem.class,
                                                    shoppingCartSummary.thenFindAll(shoppingCartProductsXPath),
                                                    this);
   }
}
