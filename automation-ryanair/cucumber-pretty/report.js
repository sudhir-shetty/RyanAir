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
  "name": "I make a booking from \u003csource\u003e to \u003cdestination\u003e on \u003cdate\u003e for \u003cno_adults\u003e , \u003cno_teen\u003e and \u003cno_child\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I pay for booking with card details \u003ccard_number\u003e , \u003ccard_type\u003e , \u003ccard_exp_month\u003e , \u003ccard_exp_year\u003e , \u003ccard_cvv\u003e and \u003ccard_holder\u003e",
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
        "card_number",
        "card_type",
        "card_exp_month",
        "card_exp_year",
        "card_cvv",
        "card_holder"
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
        "07/12/2018",
        "2",
        "1",
        "1",
        "5555555555555557",
        "MasterCard",
        "10",
        "2019",
        "265",
        "Pika Pika"
      ],
      "line": 12,
      "id": "card-decline;verify-error-message-for-invalid-card-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4506267930,
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
  "name": "I make a booking from Madrid to Dublin on 07/12/2018 for 2 , 1 and 1",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I pay for booking with card details 5555555555555557 , MasterCard , 10 , 2019 , 265 and Pika Pika",
  "matchedColumns": [
    8,
    9,
    10,
    11,
    12,
    13
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
  "duration": 7799201747,
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
      "val": "07/12/2018",
      "offset": 42
    },
    {
      "val": "2",
      "offset": 57
    },
    {
      "val": "1",
      "offset": 61
    },
    {
      "val": "1",
      "offset": 67
    }
  ],
  "location": "TestStepDefination.i_want_to_write_a_step_with_precondition(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 52720587650,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5555555555555557",
      "offset": 36
    },
    {
      "val": "MasterCard",
      "offset": 55
    },
    {
      "val": "10",
      "offset": 68
    },
    {
      "val": "2019",
      "offset": 73
    },
    {
      "val": "265",
      "offset": 80
    },
    {
      "val": "Pika Pika",
      "offset": 88
    }
  ],
  "location": "TestStepDefination.i_pay_for_booking_with_card_details_ww_ww_and_ww(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 29640937536,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDefination.some_other_action()"
});
formatter.result({
  "duration": 25453077411,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.42.591059 (a3d9684d10d61aa0c45f6723b327283be1ebaad8),platform\u003dMac OS X 10.13.4 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027sudhirkumarsMBP.home\u0027, ip: \u0027fe80:0:0:0:144b:2c2f:df16:7517%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.4\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591059 (a3d9684d10d61a..., userDataDir: /var/folders/1h/ptxysd7j76j...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49861}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: 52a31050b021114cd75cba80ba6a4d18\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:294)\n\tat com.mytest.automation_ryanair.Pages.Page.TakeScreenShot(Page.java:182)\n\tat com.mytest.automation_ryanair.Pages.Page.CheckElementToBeDisplayed(Page.java:249)\n\tat com.mytest.automation_ryanair.Pages.Page.AssertElementIsDisplayedWithSeconds(Page.java:259)\n\tat com.mytest.automation_ryanair.PageFunctions.CheckOutPageFunctions.CheckCardDeclineMessageIsDisplayed(CheckOutPageFunctions.java:113)\n\tat com.mytest.automation_ryanair.myStepDefination.TestStepDefination.some_other_action(TestStepDefination.java:50)\n\tat ✽.Then I should get payment declined message(src/test/resource/features/testcases.feature:8)\n",
  "status": "failed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 3617934,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.42.591059 (a3d9684d10d61aa0c45f6723b327283be1ebaad8),platform\u003dMac OS X 10.13.4 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027sudhirkumarsMBP.home\u0027, ip: \u0027fe80:0:0:0:144b:2c2f:df16:7517%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.4\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591059 (a3d9684d10d61a..., userDataDir: /var/folders/1h/ptxysd7j76j...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49861}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: 52a31050b021114cd75cba80ba6a4d18\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:294)\n\tat com.mytest.automation_ryanair.Pages.Page.TakeScreenShot(Page.java:182)\n\tat com.mytest.automation_ryanair.myStepDefination.TestStepDefination.tearDown(TestStepDefination.java:65)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:81)\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:69)\n\tat org.testng.TestRunner$1.run(TestRunner.java:697)\n\tat org.testng.TestRunner.runJUnitWorkers(TestRunner.java:1004)\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:728)\n\tat org.testng.TestRunner.run(TestRunner.java:629)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:99)\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:383)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:344)\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:125)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:417)\n",
  "status": "failed"
});
});