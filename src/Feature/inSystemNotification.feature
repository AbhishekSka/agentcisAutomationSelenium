Feature: In system notification

  Background: I am already registered to the agentcis system

  Scenario: To Login
    Given I am on the login page
    When I enter the correct email address
    And I enter the correct password
    And I click on the Login button
    Then I should be authenticated
    And I should be redirected to the system dashboard

  Scenario: To Check whether Permission is on/off
    Given I am on the dashboard
    When I click on the Setting button on top right
    And I see a dropdown
    And I click on the Notification Setting
    Then I should redirected to the Notification setting page
    And I see Two Tab button Email Notification & System Notification
    And I click on the System Notification button
    Then I check for the Setting On/off
    And I made the setting On

  Scenario: A new enquiry submits the form
    Given I filled up the Lead form
    When I submitted the lead form selecting the preferred office
    And I get notification
    And I clicked on the Notification button
    And I see the List of Notification
    And I click on the notification
    Then I redirected to the enquiry detail page

    When I submitted the lead form without selecting the preferred office
    Then Owner and user with owner's Primary office will only get notification

  Scenario: While making Enquiry to Prospect
    Given I approve the enquiry
    When I assigned user to the enquiry
    Then The user get notification

  Scenario: While editing the assignee of prospect or client
    Given I edited the profile of prospect or client
    When I changed the assignee of the prospect or client
    Then The newly assigned assignee get notification

  Scenario: A task is assigned and any changes on that task respectively
    Given I assigned a new user to task
    When I created a new task
    And I assigned a new User to that task
    Then The new assigned user get notification
    When I made any changes to the task
    Then The assignee get notification
    When Any other Premission user other than I or assignee delete task
    Then I get Notification
    And Assignee get Notification
    When I assigned a user while creating task
    And user modified or changes anything on the task
    Then I get notification

  Scenario: Changes on prospect added by me
    Given I added a prospectt
    When Assignee made any changes on the Prospect or CLient detail
    And I get Notification
    And I click on the Notification button
    And I see the list of Notification
    And I click on the Notification I get
    Then I redirected to the prospect profile

  Scenario: Changes on client added by me
    Given I added a client
    When Assignee made any changes on the CLient detail
    And I get Notification
    And I click on the Notification button
    And I see the list of Notification
    And I click on  the Notification I get
    Then I redirected to the client profile

  Scenario: Changes on prospect assigned to me
    Given User added me as a assignee to a prospect
    When Assignee made any changes on the prospect
    And I get Notification
    And I click on the Notification button
    And I see the list of Notification
    And I click on the Notification
    Then I redirected to the prospect profile

  Scenario: Changes on client assigned to me
    Given User added me as a assignee to a client
    When Assignee made any changes on the client
    And I get Notification
    And I click on the Notification button
    And I see the list of Notification
    And I click on the notification
    Then I redirected to the client profile

  Scenario: Changes on application added by me
    Given I added a miltiple assignee to an application
    When Assignee made any changes to an application
    And I get Notification
    And I click on the Notification button
    And I see the list of Notification
    And I click on the Notification
    Then I redirected to the application where changes is done

  Scenario: Changes on application assigned to me
    Given User added me as a one of multiple assignee to an application
    When User made any changes to an application
    And I get Notification
    And I click on the Notification button
    And I see the list of Notification
    And I click on the Notification
    Then I redirected to the application where user made changes
    When A application have multiple assignee
    And multiple assignee made any changes
    Then I get Notification
    Then The user who added the application get notification

  Scenario: Changes on application by owner
    Given Owner have access to any of the client application
    When Owner made any changes on an application
    And I get Notification
    And I click on the Notification button
    And I see the list of Notification
    And I click on the Notification
    Then I redirected to the application


  Scenario: Changes on application by owner having multiple assignee
    Given Owner have access to any of the client application
    When Owner made any changes on an application
    Then multiple assignee get Notification
