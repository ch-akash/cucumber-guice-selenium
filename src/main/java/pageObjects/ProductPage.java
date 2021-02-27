package main.java.pageObjects;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import main.java.core.BaseDriver;
import main.java.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {


    private WebDriverWait webDriverWait;

    @Inject
    private BaseDriver baseDriver;

    @Inject
    @Named("home.page")
    private String url;

    @FindBy(css = "span[class='button-content wsb-button-content']")
    private WebElement greenTeaTextElement;

    @FindBy(css = "div[id='wsb-element-00000000-0000-0000-0000-000450914895']")
    private WebElement teaCollectionElement;

    @FindBy(css = "div[id='wsb-element-00000000-0000-0000-0000-000451934628'")
    private WebElement greenTeaProductDescription;

    @Inject
    public ProductPage(BaseDriver baseDriver) {
        this.webDriverWait = new WebDriverWait(baseDriver.driver(), 60);
        PageFactory.initElements(baseDriver.driver(), this);
    }

    public ProductPage visitPage() {
        this.baseDriver.get(url);
        return this;
    }

    public String getCollectionList(WebElement webElement) {
        this.wait(webElement);
        return webElement.getText();
    }

    public ProductPage wait(WebElement webElement) {
        this.wait(webElement, webDriverWait);
        return this;
    }

    @Override
    public void wait(WebElement element, WebDriverWait webDriverWait) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    @Override
    public void scrollIntoView(WebElement webElement) {

    }

    @Override
    public void navigateBack() {

    }

    @Override
    public void getPageTitle(WebDriver.Window window) {

    }

    @Override
    public void select(WebElement webElement, String key) {
    }

    public WebElement getGreenTeaTextElement() {
        return greenTeaTextElement;
    }

    public WebElement getTeaCollectionElement() {
        return teaCollectionElement;
    }

    public WebElement getGreenTeaProductDescription() {
        return greenTeaProductDescription;
    }
}
