Feature: Add to Cart
Scenario Outline: Cart Functionality
    Given user is on the Home Page
    When the user clicked on "Health Library" in Home Page
    When the user clicked on "Book and Subscription" in Home Page
    And clicked View Cancer in Book & Subscription result page
    And clicked Beyond Breast Cancer in Cancer result page
    When the user clicked "quantity input box" in Breast Cancer result page
    And clears the default value in input box
    And gave <Quantity rownum> <Quantity colnum> in quantity input box
    When the user clicked "Add to Cart" in Breast Cancer result page
    Then the user verifies the displayed messageḍ

Examples:
|Quantity rownum|Quantity colnum|
|2|2|

