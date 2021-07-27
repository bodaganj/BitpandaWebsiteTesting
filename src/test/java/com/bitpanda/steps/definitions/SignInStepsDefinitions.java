package com.bitpanda.steps.definitions;

import com.bitpanda.steps.MyAccountSteps;
import com.bitpanda.steps.SignInSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SignInStepsDefinitions {

   @Steps
   private SignInSteps signInSteps;

   @Steps
   private MyAccountSteps myAccountSteps;

   @Given("sign in page is opened")
   public void openSignInPage() {
      signInSteps.openSignInPage();
   }

   @When("user tries to sign in with the following credentials: email = $email and password = $password")
   public void signInWithCredentials(final String email, final String password) {
      signInSteps.signInWithCredentials(email, password);
   }

   @Then("my account page is shown")
   public void checkAccountMainPageIsShown() {
      assertThat(myAccountSteps.isMyAccountPageVisible())
         .as("My Account page should be opened.")
         .isTrue();
   }

   @Then("appropriate alert is shown")
   public void checkAlertIsShown() {
      assertThat(signInSteps.isAuthAlertVisible())
         .as("Authentication alert should be visible.")
         .isTrue();
   }
}
