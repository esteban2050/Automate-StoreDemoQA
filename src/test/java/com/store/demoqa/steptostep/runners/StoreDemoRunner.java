package com.store.demoqa.steptostep.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
/**
 * 
 * @author Juan Esteban Lopez Giraldo.
 *
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/tes/resources/features/storeDemoQA.feature",
glue = "com.store.demoqa.steptostep.stepDefinitions",
tags= {"@BuyProduct"},
snippets = SnippetType.CAMELCASE)


public class StoreDemoRunner {

	
}
