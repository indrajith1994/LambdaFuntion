package com.gorest.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"/Users/indrajit/eclipse-workspace/BDDFramework/src/main/java/com/gorest/feature/goRest.feature"}
,glue={"stepdef"},monochrome=true,dryRun=true)

public class gorestRunner {

}
