package com.mytest.automation_ryanair.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = { "src/test/resource/features/testcases.feature" }, plugin = { "pretty:STDOUT",
		"html:cucumber-pretty",
		"json:cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:report.html" }
		, monochrome = true, glue = { "com.mytest.automation_ryanair.myStepDefination" }, dryRun = false

)

public class RunnerTest {

}
