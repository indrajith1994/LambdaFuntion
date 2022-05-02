package com.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features={"/Users/indrajit/eclipse-workspace/DemoBddFramework/src/main/java/com/bdd/features/petsOrder.feature"},
        glue={"com.bdd.stepdefs"},
        monochrome=true)


public class Runner {

}
