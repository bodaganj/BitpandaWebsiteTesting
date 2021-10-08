package com.bitpanda.steps;

import com.bitpanda.items.ShoppingCartProductItem;
import com.bitpanda.pages.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

public class SoppingCartSteps extends ScenarioSteps {

   private ShoppingCartPage shoppingCartPage;

   @Step
   public boolean isShoppingCartEmpty() {
      return shoppingCartPage.getEmptyShoppingCart().isPresent();
   }

   @Step
   public Integer getNumberOfProductsWithinShoppingCart() {
      shoppingCartPage.open();
      return shoppingCartPage.getAllProductsWithinShoppingCart().size();
   }

   @Step
   public void removeProducts(final List<String> productIds) {
      List<ShoppingCartProductItem> allProductsWithinShoppingCart = shoppingCartPage.getAllProductsWithinShoppingCart();
      allProductsWithinShoppingCart.stream()
                                   .filter(item -> productIds.contains(item.getProductId()))
                                   .forEach(ShoppingCartProductItem::removeProduct);
   }
}
