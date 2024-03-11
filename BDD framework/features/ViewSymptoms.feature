Feature: View Symptoms

    @test8
    Scenario: Search and View Symptoms Functionality
        Given user is on the Home Page
        When User clicks on "Health Library" link on "Home" page
        And User clicks on "Symptoms" link on "Home" page
        And User clicks on "C" link on "Symptoms" page
        And User clicks on "Cough" link on "Symptoms with letter=C" page
        And User clicks on "When to see a doctor" link on "Cough" page
        And User verifies the Text "When to see a doctor"
        And User scrolls down to "Email Preview" section
        And User clicks on "Click here for an email preview" link on "when to see doctor" page
        And User scrolls down to "Get care now" section
        And User clicks on "Get care now" link on "email preview" page
        Then User verifies the Text "Start your appointment request here."