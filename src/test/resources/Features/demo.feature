Feature: Feature to test login functionality

  @SmokeTest
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <userId> and <password>
    And clicks login button
    Then user is navigated to the home page

    Examples: 
      | userId               | password |
      | vi20210230@gmail.com | anu      |
