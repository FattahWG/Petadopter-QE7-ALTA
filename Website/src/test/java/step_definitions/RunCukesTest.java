package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@test"},
        features = {"classpath:features/"},
        glue = {"classpath:step_definitions"},
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)
public class RunCukesTest {}