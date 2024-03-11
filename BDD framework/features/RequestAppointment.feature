Feature: Request appointment

    @test9
    Scenario: Request appointment process for new patients
        Given user is on the Home Page
        When user clicks on "Request Appointment" link on "Home" page
        And user clicks on "New Patients" link on "appointments" page
        And user clicks on "Outside of the U.S." link on "appointments location" page
        And user clicks on "Continue" link on "New Appointments" page
        And user clicks on "Start" link on "New Appointments" page
        And user clicks on "Yes I am a patient" link on "New Appointments" page
        And user clicks on "Continue" link on "New Appointments" page
        And user clicks on "Yes" link on "New Appointments" page
        And user clicks on "Continue" link on "New Appointments" page
        And user clicks on "I do not have any medical records" link on "New Appointments" page
        And user clicks on "Continue" link on "New Appointments" page
        And user clicks on "Yes" link on "New Appointments" page
        And user clicks on "Continue" link on "New Appointments" page
        And user clicks on "Yes" link on "New Appointments" page
        And user clicks on "Continue" link on "New Appointments" page
        And user verifies the text "Patient Information" 
        And user clicks on "Mayo Clinic logo" link on "New Appointments" page
        And user clicks on "Exit the request" option from the popup
        Then user verifies the text "New Patients" 
        And user verifies the text "Start your appointment request here."

