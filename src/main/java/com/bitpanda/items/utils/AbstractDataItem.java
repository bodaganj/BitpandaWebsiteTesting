package com.bitpanda.items.utils;

import com.bitpanda.pages.AbstractPage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.WebDriver;

@Getter
@AllArgsConstructor
public abstract class AbstractDataItem implements DataItem {

   private final AbstractPage driverDelegate;

   @Override
   public WebDriver getDriver() {
      return driverDelegate.getDriver();
   }
}
