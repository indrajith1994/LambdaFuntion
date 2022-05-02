package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/indrajit/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/loginguru.feature"},
//		features = {"/Users/indrajit/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/login.feature"},
//		features = {"/Users/indrajit/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/addNewcustomer.feature"},
		glue = { "stepDefinition","LoginStepDefinition" }, 
		format = { "pretty"}
		//		tags = {"@Gurudemo_Login","@AddNewCustomer"},
//		tags = {"@add_customer"}
		// monochrome=true
		)

public class TestRunner {

}
