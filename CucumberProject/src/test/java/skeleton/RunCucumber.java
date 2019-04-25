package skeleton;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber_reports"},features=
"src/test/resources/skeleton/testmeapp.feature",monochrome=true,dryRun=false)
public class RunCucumber {
	
	
	

}
