package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "./features", 
	glue = "StepDefinition",
	plugin = { "pretty" }, 
	tags="@test8, @test9")
	
public class RunTest {
}
