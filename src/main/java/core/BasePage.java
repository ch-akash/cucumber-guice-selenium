package main.java.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected void wait(WebElement element, WebDriverWait webDriverWait) {

    }

    protected void scrollIntoView(WebElement webElement) {

    }

    protected void navigateBack() {

    }

    protected void getPageTitle(WebDriver.Window window) {

    }

    protected void select(WebElement webElement, String key) {

    }
}
