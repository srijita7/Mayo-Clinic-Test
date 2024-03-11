Feature: Explore Career
Scenario Outline: Search Jobs Functionality
    Given user is on the Home Page
    When the user clicked on Explore Career in Home Page
    When the user clicked "Search By Role input box" in Explore Career result page
    And gave <Role row> <Role col> in the Search by Role input box
    When the user clicked "Enter Location input box" in Explore Career result page
    And gave <Location row> <Location col> in Enter Location input box
    And clicked search icon in Explore Career result page 
    When the user clicked "area of interest" in Search Jobs result page
    When the user clicked "Critical Care" in Search Jobs result page
    And clicked first result in Search Jobs result page
    And clicked Apply Now in Research result page
    Then the user verifies the displayed message in Apply result page

Examples:
|Role row|Role col|Location row|Location col|
|2|4|2|3|