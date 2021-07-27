package com.bitpanda.items.utils;

import com.bitpanda.pages.AbstractPage;
import org.openqa.selenium.WebDriver;

public interface DataItem {

   AbstractPage getDriverDelegate();

   WebDriver getDriver();
}
