Feature: Search and explore about diseases

  Scenario Outline: Search Functionality
    Given user is on the Home Page
    When user clicks on the "Search box"
    And user enters <disease rownum> <disease colnum> in the search bar
    And user clicks on "Search Button"
    And user clicks on "type2 diabetes"
    And user clicks on "Symptoms and Causes" 
    And user clicks on "Diagnosis and Treatment" 
    And user clicks on "Doctors and Departments"
    Then user verifies heading present on the result page is accurate

    Examples: 
      | disease rownum | disease colnum |
      |              2 |               0 |
