package main.java.stepDefinitions;

import com.google.inject.Inject;
import io.cucumber.java.After;
import main.java.core.BaseDriver;

public class DriverSetupSteps {

    @Inject
    private BaseDriver baseDriver;

    @After
    public void tearDownDriver() {
        baseDriver.quit();
    }
}
