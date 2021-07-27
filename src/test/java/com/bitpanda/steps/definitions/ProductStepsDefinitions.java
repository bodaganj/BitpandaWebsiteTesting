package com.bitpanda.steps.definitions;

import com.bitpanda.steps.ProductSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class ProductStepsDefinitions {

   @Steps
   private ProductSteps productSteps;

   @Given("product (product id = $productId) page is open")
   public void openProductPage(final String productId) {
      productSteps.openProductPage(productId);
   }

   @When("product is added to shopping cart")
   public void addProductToShoppingCart() {
      productSteps.addProductToShoppingCart();
   }
}
