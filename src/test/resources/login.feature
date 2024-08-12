Feature: To login facebook page

Background: To navigate facebook login page
Given User navigate to facebook login page

Scenario: To login with incrediential values in facebook
 And User enter incorrect username and incorrect password
 When User clicks login button
 Then User is in incrediential page


