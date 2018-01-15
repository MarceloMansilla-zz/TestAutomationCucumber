$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/bookRepository.feature");
formatter.feature({
  "line": 1,
  "name": "Curso de automation",
  "description": "",
  "id": "curso-de-automation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Log in to the system",
  "description": "",
  "id": "curso-de-automation;log-in-to-the-system",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter a term in search \u003csearch\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I sort the list results by \u003corder\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on the first element",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The desctiption screen should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "curso-de-automation;log-in-to-the-system;",
  "rows": [
    {
      "cells": [
        "search",
        "order"
      ],
      "line": 12,
      "id": "curso-de-automation;log-in-to-the-system;;1"
    },
    {
      "cells": [
        "Sailor moon tomo 7",
        "price_low_high"
      ],
      "line": 13,
      "id": "curso-de-automation;log-in-to-the-system;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9385848034,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Log in to the system",
  "description": "",
  "id": "curso-de-automation;log-in-to-the-system;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I enter a term in search Sailor moon tomo 7",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I sort the list results by price_low_high",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on the first element",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The desctiption screen should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sailor moon tomo 7",
      "offset": 25
    }
  ],
  "location": "FlowStep.i_enter_a_term_in_search_Sailor_moon_tomo(String)"
});
formatter.result({
  "duration": 1213146310,
  "status": "passed"
});
formatter.match({
  "location": "FlowStep.i_click_on_Search_button()"
});
formatter.result({
  "duration": 1368721647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "price_low_high",
      "offset": 27
    }
  ],
  "location": "FlowStep.i_sort_the_list_results_by_price_low_high(String)"
});
formatter.result({
  "duration": 1875224635,
  "status": "passed"
});
formatter.match({
  "location": "FlowStep.i_click_on_the_first_element()"
});
formatter.result({
  "duration": 3103730109,
  "status": "passed"
});
formatter.match({
  "location": "FlowStep.the_desctiption_screen_should_be_displayed()"
});
formatter.result({
  "duration": 117566,
  "status": "passed"
});
formatter.write("--------------------------------------------------------------");
formatter.write("ID: curso-de-automation;log-in-to-the-system;;2");
formatter.write("Name : Log in to the system");
formatter.write("Status : passed");
formatter.write("Price : ARS$289,11");
formatter.embedding("image/png", "embedded0.png");
formatter.write("--------------------------------------------------------------");
formatter.after({
  "duration": 3451968672,
  "status": "passed"
});
});