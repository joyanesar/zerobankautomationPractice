package com.zerobank.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue =  "com/zerobank/stepdefinations",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}
