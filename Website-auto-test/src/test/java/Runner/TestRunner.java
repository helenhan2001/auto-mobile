package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "com.pack.common.stepDefination" }, plugin = { "pretty",
		"html:target/cucumber", "json:target/cucumber.json", "junit:target/junit" }, tags = { "@Login," }// what
																											// tags
																											// to
																											// include(@)/exclude(@~)"@deals"
)

public class TestRunner {

}