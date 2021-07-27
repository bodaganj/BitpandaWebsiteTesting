package com.bitpanda.steps;

import com.bitpanda.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static net.serenitybdd.core.pages.PageObject.withParameters;

public class ProductSteps extends ScenarioSteps {

   private ProductPage productPage;

   @Step
   public void openProductPage(final String productId) {
      productPage.open("productId", withParameters(productId));
   }

   @Step
   public void addProductToShoppingCart() {
      productPage.clickAddToCartButton();
   }
}
