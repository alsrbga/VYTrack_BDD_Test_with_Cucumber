package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports.html",
                "rerun:target/rerun.txt"
        },
        tags = "@navigation or @storemanager",
        features = {
                "src/test/resources/features"
                // to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"com/vytrack/step_definitions"},
        //dry run - to generate step definitions automatically
        //you will see them in the console output
        dryRun = false

)
public class CukesRunner {

}
