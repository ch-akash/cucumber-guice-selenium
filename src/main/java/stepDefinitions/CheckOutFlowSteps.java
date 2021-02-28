package main.java.stepDefinitions;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.java.pageObjects.ProductPage;
import test.java.CukeTest;

import static test.base.BaseTest.TEST_LOGGER;


@ScenarioScoped
public class CheckOutFlowSteps extends CukeTest {

    @Inject
    protected ProductPage productPage;

    private String desc;

    @Given("user is on home page")
    public void userIsOnHomePage() {
        productPage.when().visitPage();
    }

    @When("we select Tea collection to view")
    public void weSelectTeaCollectionToView() {
        productPage.then().getTeaCollectionElement().click();
    }

    @And("we extract green tea description")
    public void weExtractGreenTeaDescription() {
        desc = productPage
                .when()
                .wait(productPage.getGreenTeaTextElement())
                .then()
                .getGreenTeaProductDescription()
                .getText();
    }

    @And("we just log it")
    public void weJustLogIt() {
        TEST_LOGGER.info("Fetched Product description: {}", desc);
    }
}
