Feature: Test and Procedures
    
    Scenario: Validating Test and Procedure Functionality

        Given user is on the Home Page
        When User clicks on "Health Library"
        And User clicks on "Test and Procedures"
        And User clicks on "Keyword-M"
        And User clicks on "MRI"
        Then User verifies the result page contains the label Overview