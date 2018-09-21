$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/features/testcases.feature");
formatter.feature({
  "line": 1,
  "name": "Card Decline",
  "description": "",
  "id": "card-decline",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify Error Message For Invalid Card Data",
  "description": "",
  "id": "card-decline;verify-error-message-for-invalid-card-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am logged in to the application with \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I make a booking from \u003csource\u003e to \u003cdestination\u003e on \u003cdate\u003e for \u003cno_adults\u003e adults , \u003cno_teen\u003e teen , \u003cno_child\u003e child and \u003cno_infant\u003e infant",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I pay for booking with card details \u003ccard_number\u003e , \u003ccard_exp\u003e and \u003ccard_cvv\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get payment declined message",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "card-decline;verify-error-message-for-invalid-card-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "source",
        "destination",
        "date",
        "no_adults",
        "no_teen",
        "no_child",
        "no_infant",
        "card_number",
        "card_exp",
        "card_cvv"
      ],
      "line": 11,
      "id": "card-decline;verify-error-message-for-invalid-card-data;;1"
    },
    {
      "cells": [
        "testkiprosh@gmail.com",
        "Test@123",
        "Madrid",
        "Dublin",
        "18/10/2018",
        "1",
        "1",
        "0",
        "0",
        "5555 5555 5555 5557",
        "1018",
        "265"
      ],
      "line": 12,
      "id": "card-decline;verify-error-message-for-invalid-card-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 28500135296,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify Error Message For Invalid Card Data",
  "description": "",
  "id": "card-decline;verify-error-message-for-invalid-card-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am logged in to the application with testkiprosh@gmail.com and Test@123",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I make a booking from Madrid to Dublin on 18/10/2018 for 1 adults , 1 teen , 0 child and 0 infant",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I pay for booking with card details 5555 5555 5555 5557 , 1018 and 265",
  "matchedColumns": [
    9,
    10,
    11
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get payment declined message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "testkiprosh@gmail.com",
      "offset": 39
    },
    {
      "val": "Test@123",
      "offset": 65
    }
  ],
  "location": "TestStepDefination.I_am_logged_into_application(String,String)"
});
formatter.result({
  "duration": 79526798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Madrid",
      "offset": 22
    },
    {
      "val": "Dublin",
      "offset": 32
    },
    {
      "val": "18/10/2018",
      "offset": 42
    },
    {
      "val": "1",
      "offset": 57
    },
    {
      "val": "1",
      "offset": 68
    },
    {
      "val": "0",
      "offset": 77
    },
    {
      "val": "0",
      "offset": 89
    }
  ],
  "location": "TestStepDefination.i_want_to_write_a_step_with_precondition(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 99166577568,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //div[@id\u003d\u0027ngdialog2\u0027]//div[contains(@class,\u0027seat-map-prompt\u0027)]//button (tried for 60 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:113)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\n\tat com.mytest.automation_ryanair.Pages.Page.WaitForElementToBeVisible(Page.java:41)\n\tat com.mytest.automation_ryanair.Pages.Page.GetWebElement(Page.java:36)\n\tat com.mytest.automation_ryanair.Pages.Page.WaitForClickable(Page.java:207)\n\tat com.mytest.automation_ryanair.PageFunctions.FlightSelectionPageFunctions.SeatSelectionProcess(FlightSelectionPageFunctions.java:28)\n\tat com.mytest.automation_ryanair.myStepDefination.TestStepDefination.i_want_to_write_a_step_with_precondition(TestStepDefination.java:34)\n\tat ✽.And I make a booking from Madrid to Dublin on 18/10/2018 for 1 adults , 1 teen , 0 child and 0 infant(src/test/resource/features/testcases.feature:6)\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //div[@id\u003d\u0027ngdialog2\u0027]//div[contains(@class,\u0027seat-map-prompt\u0027)]//button\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027sudhirkumarsMBP.home\u0027, ip: \u0027fe80:0:0:0:4fe:9fde:50dc:9d6e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.4\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: unknown\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\n\tat java.util.Optional.orElseThrow(Optional.java:290)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\n\tat com.mytest.automation_ryanair.Pages.Page.WaitForElementToBeVisible(Page.java:41)\n\tat com.mytest.automation_ryanair.Pages.Page.GetWebElement(Page.java:36)\n\tat com.mytest.automation_ryanair.Pages.Page.WaitForClickable(Page.java:207)\n\tat com.mytest.automation_ryanair.PageFunctions.FlightSelectionPageFunctions.SeatSelectionProcess(FlightSelectionPageFunctions.java:28)\n\tat com.mytest.automation_ryanair.myStepDefination.TestStepDefination.i_want_to_write_a_step_with_precondition(TestStepDefination.java:34)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "5555 5555 5555 5557 ",
      "offset": 36
    },
    {
      "val": " 1018",
      "offset": 57
    },
    {
      "val": "265",
      "offset": 67
    }
  ],
  "location": "TestStepDefination.i_pay_for_booking_with_card_details_ww_ww_and_ww(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestStepDefination.some_other_action()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 450409577,
  "status": "passed"
});
});