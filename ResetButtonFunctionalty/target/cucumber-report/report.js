$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataTable/dataTable.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of reset button with numbers of credential",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the Username and Password",
  "rows": [
    {
      "cells": [
        "user11",
        "pswd11"
      ],
      "line": 8
    },
    {
      "cells": [
        "user22",
        "pswd22"
      ],
      "line": 9
    },
    {
      "cells": [
        "user33",
        "pswd33"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.open_the_firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 6113171947,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.enter_the_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 3479523977,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.reset_the_credential()"
});
formatter.result({
  "duration": 1064824223,
  "status": "passed"
});
});