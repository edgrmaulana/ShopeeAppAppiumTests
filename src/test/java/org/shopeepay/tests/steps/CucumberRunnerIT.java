package org.shopeepay.tests.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@SpringBootTest
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.shopeepay.tests.steps",
                "org.shopeepay.tests.hooks"},
        stepNotifications = true,
        plugin = {"pretty",
                "json:target/cucumber.json"},
        tags = "@Positive"
)
public class CucumberRunnerIT {

}
