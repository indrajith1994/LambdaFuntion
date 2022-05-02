$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginguru.feature");
formatter.feature({
  "line": 2,
  "name": "Login Guru99 demo site",
  "description": "",
  "id": "login-guru99-demo-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login Guru99 page",
  "description": "",
  "id": "login-guru99-demo-site;login-guru99-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Gurudemo_Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Web browser is at Guru demo login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter login credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Validate title of home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.web_browser_is_at_Guru_login_page()"
});
formatter.result({
  "duration": 11208033287,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.enter_login_credentials()"
});
formatter.result({
  "duration": 323688293,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.click_login_button()"
});
formatter.result({
  "duration": 1837278738,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_title_of_home_page()"
});
formatter.result({
  "duration": 23764087,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 170692445,
  "status": "passed"
});
});