package com.bitpanda.items;

import com.bitpanda.items.utils.AbstractDataItem;
import com.bitpanda.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShoppingCartProductItem extends AbstractDataItem {

   @FindBy(xpath = ".//td[@class='cart_product']/a")
   private WebElementFacade product;

   @FindBy(xpath = ".//td[@class='cart_delete text-center']//a")
   private WebElementFacade delete;

   public ShoppingCartProductItem(final AbstractPage driverDelegate) {
      super(driverDelegate);
   }

   public void removeProduct() {
      delete.click();
   }

   public String getProductId() {
      String xref = product.getAttribute("href");
      Pattern pattern = Pattern.compile("(?<=id_product=)(.*)(?=&)");
      Matcher matcher = pattern.matcher(xref);
      if (matcher.find()) {
         return matcher.group(1);
      } else {
         throw new RuntimeException("No productId found.");
      }
   }
}
