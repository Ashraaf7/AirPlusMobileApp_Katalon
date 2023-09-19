Feature: Tutorial

Scenario Outline: To verify the user can launch the A+ mobile app
Given User should have A+ mobile app
When User taps on allow notifications
Then User expects first tutorial page should be displayed

Scenario Outline: To verify the first tutorial page
Given User should have first tutorial page
Then tutorial title should be displayed
And description should be displayed
And user expects next button below the description

Scenario Outline: To verify the second tutorial page
Given User should have first tutorial page
When User tap on next button
Then tutorial title should be displayed
And description should be displayed
And user expects next button below the description

Scenario Outline: To verify the third tutorial page
Given User should have second tutorial page
When User swipe the page from right to left
Then tutorial title should be displayed
And description should be displayed
And user expects next button below the description

Scenario Outline: To verify the fourth tutorial page
Given User should have third tutorial page
When User tap on next button
Then tutorial title should be displayed
And description should be displayed
And user expects Finish button below the description

Scenario Outline: Verify the welcome page
Given User should have welcome page
When verify the welcome page
Then welcome page should be displayed as below
