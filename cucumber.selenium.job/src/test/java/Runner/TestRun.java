package Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions (features= {"src//test//java//Features"},glue= {"Implementations","utility"}, plugin= {"pretty","html:target/cucumber"}

,tags= {"@appium"})

@Test
public class TestRun extends AbstractTestNGCucumberTests {
	
	

}
