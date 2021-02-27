package test.java;

import com.google.inject.Inject;
import main.java.pageObjects.ProductPage;
import org.testng.annotations.Test;
import test.base.BaseTest;

public class TestNgGuiceTest extends BaseTest {

    @Inject
    private ProductPage productPage;

    @Test
    public void runFirst() {

        productPage.visitPage().getTeaCollectionElement().click();
        TEST_LOGGER.info("Fetched Product description: {}", productPage
                .wait(productPage.getGreenTeaTextElement())
                .getGreenTeaProductDescription()
                .getText());
    }
}
