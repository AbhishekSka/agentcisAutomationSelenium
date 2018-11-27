Feature:
  Login to the application

  Scenario:
  Login to site with correct mailid and password

  Given I navigate to Democis agentcis Application
    And I enter the mailid  as "dummymail1642@gmail.com" and Password as "agentcis"
    And I click on login button
    Then I should see the Dashboad overview page


