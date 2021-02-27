package test.base;

import com.google.inject.Inject;
import main.java.core.BaseDriver;
import main.java.core.modules.DriverModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Guice;

@Guice(modules = DriverModule.class)
public class BaseTest {

    @Inject
    private BaseDriver baseDriver;

    public final static Logger TEST_LOGGER = LoggerFactory.getLogger("TestLogger");
    protected final static Logger SUITE_LOGGER = LoggerFactory.getLogger("TearDownLogger");

    @AfterSuite
    public void tearDown() {
        baseDriver.quit();
        SUITE_LOGGER.info("Driver instance killed");
    }
}
