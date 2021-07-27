package com.bitpanda.steps.definitions;

import com.bitpanda.steps.SoppingCartSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartStepsDefinitions {

   @Steps
   private SoppingCartSteps shoppingCartSteps;

   @When("$numberOfProducts product is present on shopping cart")
   @Then("$numberOfProducts product is present on shopping cart")
   @Alias("$numberOfProducts products are present on shopping cart")
   public void checkProductPresenceOnShoppingCart(final Integer numberOfProducts) {
      assertThat(shoppingCartSteps.getNumberOfProductsWithinShoppingCart())
         .as("The amount of products on shopping cart is not as expected.")
         .isEqualTo(numberOfProducts);
   }

   @When("following products are removed from shopping cart: productId = $productId")
   @Alias("following product is removed from shopping cart: productId = $productId")
   public void removeProductFromShoppingCart(final List<String> productId) {
      shoppingCartSteps.removeProducts(productId);
   }

   @Then("shopping cart is empty")
   public void checkShoppingCartIsEmpty() {
      assertThat(shoppingCartSteps.isShoppingCartEmpty())
         .as("Shopping cart should be empty.")
         .isTrue();
   }
}
