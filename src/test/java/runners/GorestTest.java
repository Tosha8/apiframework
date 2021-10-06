package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {
                    "classpath:features"
            },
            glue = {
                    "step_defs"
            },
            tags = {
                    "@Test2"
            },
            dryRun = true
    )
    public class GorestTest {
    }

