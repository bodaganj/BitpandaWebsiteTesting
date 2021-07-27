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
      signInPage.signInWithCredentials(email, password);
   }

   @Step
   public boolean isAuthAlertVisible() {
      return signInPage.isAuthAlertVisible();
   }
}
