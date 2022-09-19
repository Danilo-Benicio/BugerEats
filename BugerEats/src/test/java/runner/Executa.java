package runner;
import org.junit.runner.RunWith;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@positivo",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/Cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)
public class Executa extends Drivers {
	

		
}
