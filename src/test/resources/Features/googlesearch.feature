Feature: Feature to test google search functionality
@Smoke
Scenario: Check google search is successful

Given browser is open
And user is on google search page
When user enters text in search box
And hiits enter
Then user is navigated to search results

