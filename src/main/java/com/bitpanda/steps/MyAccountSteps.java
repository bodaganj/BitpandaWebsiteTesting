package com.bitpanda.steps;

import com.bitpanda.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountSteps extends ScenarioSteps {

   private MyAccountPage myAccountPage;

   @Step
   public boolean isMyAccountPageVisible() {
      return myAccountPage.getMyAccount().isVisible();
   }
}
