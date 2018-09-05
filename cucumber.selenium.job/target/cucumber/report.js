$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Calc.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@appium"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@appium"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "find number two",
  "keyword": "Then "
});
formatter.match({
  "location": "Calc_Implementation.find_number_two()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find plus sign",
  "keyword": "Then "
});
formatter.match({
  "location": "Calc_Implementation.find_plus_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find numberfour",
  "keyword": "Then "
});
formatter.match({
  "location": "Calc_Implementation.find_numberfour()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click equal to",
  "keyword": "Then "
});
formatter.match({
  "location": "Calc_Implementation.click_equal_to()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find results in text bar",
  "keyword": "Then "
});
formatter.match({
  "location": "Calc_Implementation.find_results_in_text_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});