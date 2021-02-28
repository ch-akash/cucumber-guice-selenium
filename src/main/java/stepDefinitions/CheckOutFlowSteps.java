package main.java.stepDefinitions;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java8.En;
import main.java.pageObjects.ProductPage;
import test.java.CukeTest;

import static test.base.BaseTest.TEST_LOGGER;


@ScenarioScoped
public class CheckOutFlowSteps extends CukeTest implements En {

    @Inject
    protected ProductPage productPage;
    private String desc;

    public CheckOutFlowSteps() {

        Given("^user is on home page$", () -> productPage.when().visitPage());

        When("^we select Tea collection to view$", () -> productPage.then().getTeaCollectionElement().click());

        Then("^we extract green tea description$", () -> desc = productPage
                .when()
                .wait(productPage.getGreenTeaTextElement())
                .then()
                .getGreenTeaProductDescription()
                .getText());

        And("^we just log it$", () -> TEST_LOGGER.info("Fetched Product description: {}", desc));
    }

}
