Feature: Find a doctor on the portal

  Scenario Outline: Search doctors functionality
    Given user is on the Home Page
    When user selects "Care at Mayo Clinic"
    And user selects "Find a doctor" 
    And user clicks on the Doctor's name, conditions or procedure search box on result page
    And user enters <condition rownum> <condition colnum> in the search box
    And user selects "Location"
    And user selects "Rochester MN"
    And user selects "Search icon"
    And user selects "first Cardiologist from the results page"
    And user selects "Send a secure message via patient portal"
    Then user verifies if the label says PATIENT ONLINE SERVICES.

    Examples: 
      | condition rownum | condition colnum |
      |                2 |                1 |
