package test.java;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/main/resources/features",
        glue = "main.java.stepDefinitions",
        plugin = {"pretty", "json:target/cucumber/cucumber.json",
                "html:target/cucumber/cucumber-reports.html"})
public class CukeTest {
}
