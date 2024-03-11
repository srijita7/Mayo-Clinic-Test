Feature: Healthy Lifestyle

    Scenario: Validating Healthy Lifestyle Functionality

        Given user is on the Home Page
        When User click on "Health Library"
        And User click on "Healthy Lifestyle"
        And User click on "Nutriton and Healthy Eating"
        And User click on "Healthy Diets"
        Then User verifies Healthy diets label is present in the result page 