package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features = { "Features" }, 
        glue = { "stepDefination"}, 
        monochrome = true,
        tags = "@Incube"

)

public class CompRunner {

}
