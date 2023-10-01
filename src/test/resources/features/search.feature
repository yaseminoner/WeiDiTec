@smoke
Feature:Searching WeiDiTec functionality
  User Story:
  As a user, I should able to search on the main page

  Scenario: User should able to see "Karriere" page and go back to main page
    Given User is on the WeiDiTec home page
    Then user accept cookies
    And user click on the Karriere button
    Then user scroll down and up the page
    And user goes back to main page
    Then user should see "WeiDiTec GmbH » Startseite" title