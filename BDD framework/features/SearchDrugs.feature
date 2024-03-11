Feature: Search Drugs

  @test3
  Scenario Outline: Search Drugs Functionality
    Given user is on the Home Page
    When user clicks on the "Health Library"
    When user clicks on the "Drugs & Supplements"
    When user clicks on the "search Drugs and Supplements"
    And user give <Input Drugs row> <Input Drugs col> in the " DrugsSearch and Supplements" field
    When user clicks on the "search button"
    When user clicks on the "Acetaminophen article"
    When user scrolls page until "Before Use" navigation
    And user clicks on the "Before Use" navigation
    When user scrolls page until "Proper Use" navigation
    And user clicks on the "Proper Use" navigation
    When user scrolls page until "Precautions" navigation
    And user clicks on the "Precautions" navigation
    When user scrolls page until "Side Effects" navigation
    And user clicks on the "Side Effects" navigation
    Then user validates "Side Effects text" isDisplayed

    Examples: 
      | Input Drugs row | Input Drugs col |
      |               2 |               5 |