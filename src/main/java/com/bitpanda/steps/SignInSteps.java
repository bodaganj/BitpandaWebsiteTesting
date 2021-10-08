package com.bitpanda.steps;

import com.bitpanda.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignInSteps extends ScenarioSteps {

   private SignInPage signInPage;

   @Step
   public void openSignInPage() {
      signInPage.open();
   }

   @Step
   public void signInWithCredentials(final String email, final String password) {
      signInPage.getEmailAddressField().type(email);
      signInPage.getPasswordField().type(password);
      signInPage.getSignInButton().click();
   }

   @Step
   public boolean isAuthAlertVisible() {
      return signInPage.getAuthAlert().isVisible();
   }
}
