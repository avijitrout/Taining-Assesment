package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\0023ZN744\\eclipse-workspace\\CucumberAssignment\\src\\test\\resources\\Features\\Uasecase.Feature",glue= {"StepDefinitions"},
monochrome=true,plugin = { "json:target/cucumber.json", "pretty","html:target/cucumber-reports" }
)
public class TestRunner {

}
