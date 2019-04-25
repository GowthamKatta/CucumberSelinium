$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/testmeapp.feature");
formatter.feature({
  "name": "TestMeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TestMeApp Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The URL of TestMe App",
  "keyword": "Given "
});
formatter.match({
  "location": "logintestme.the_URL_of_TestMe_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login as admin",
  "keyword": "When "
});
formatter.match({
  "location": "logintestme.login_as_admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "home page",
  "keyword": "Then "
});
formatter.match({
  "location": "logintestme.home_page()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat skeleton.logintestme.home_page(logintestme.java:50)\r\n\tat ✽.home page(file:src/test/resources/skeleton/testmeapp.feature:6)\r\n",
  "status": "pending"
});
formatter.after({
  "status": "passed"
});
});