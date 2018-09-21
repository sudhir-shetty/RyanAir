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
  "duration": 5759087305,
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
  "duration": 84840807,
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
  "duration": 51405837510,
  "status": "passed"
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
  "duration": 565386,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDefination.some_other_action()"
});
formatter.result({
  "duration": 67367,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 152765553,
  "status": "passed"
});
});