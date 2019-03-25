package DataTable;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" },
format = {"html:target/cucumber-report"})
public class RunTestFeature {

}
