$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/newworkspace/testmodules/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in tecfios test site and check background colrs",
  "description": "",
  "id": "log-in-tecfios-test-site-and-check-background-colrs",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user should log in to site and click blue or white",
  "description": "",
  "id": "log-in-tecfios-test-site-and-check-background-colrs;user-should-log-in-to-site-and-click-blue-or-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user is in page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks blue",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "background changes to White",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "program ends",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.the_user_is_in_page()"
});
formatter.result({
  "duration": 6778778700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_clicks_blue()"
});
formatter.result({
  "duration": 3094288500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.background_changes_to_White()"
});
formatter.result({
  "duration": 114451800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.program_ends()"
});
formatter.result({
  "duration": 678519800,
  "status": "passed"
});
});