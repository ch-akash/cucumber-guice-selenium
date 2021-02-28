package main.java.core.drivers;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import main.java.core.BaseDriver;
import main.java.exceptions.DriverNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.inject.Singleton;

@Singleton
public class BaseDriverImpl implements BaseDriver {

    @Inject
    @Named("application.driver")
    private String driverName;

    private WebDriver webDriver;

    @Override
    public WebDriver driver() {
        return getNewDriverInstance();
    }

    @Override
    public void get(String url) {
        webDriver.get(url);
    }

    @Override
    public void quit() {
        if (webDriver != null) webDriver.quit();
    }

    @Override
    public void close() {

    }

    private WebDriver getNewDriverInstance() {
        if (webDriver != null) return webDriver;
        switch (driverName) {
            case "firefox" -> {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                webDriver = new FirefoxDriver();
                return webDriver;
            }
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                webDriver = new ChromeDriver();
                return webDriver;
            }
            default -> throw new DriverNotFoundException("No such driver found: " + driverName);
        }
    }

}