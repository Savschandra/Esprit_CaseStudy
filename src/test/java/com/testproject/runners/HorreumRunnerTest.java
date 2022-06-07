package com.testproject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json",
        "html:target/cucumber-report.html",
        "rerun:target/rerun.txt", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //to generate different types of reporting
        features={"src/test/resources/features"}, //the path of the feature files
        glue = "com/testproject/stepDefs", //the path of the step definition files
        monochrome = true, //display the console output in a proper readable format
        dryRun = false, //to check the mapping is proper between feature file and stepdef file
        publish = false
        //tags = "@SmokeTest or @RegressionTest or @End2End"
)

public class HorreumRunnerTest {

}
