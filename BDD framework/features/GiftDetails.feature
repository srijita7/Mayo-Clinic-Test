Feature: Entering Gift Details

@Test6
Scenario Outline:Gift Details
    Given user is on the "Home Page"
    When user click on "Giving_on_Mayoclinic" tab
    When user click on "Give_Now" tab
    When user click on "Desired_Amount" tab
    When user click on "Designate_My_Gift" tab 
    When user click on "Medical_Education" tab
    When user click on "Anonymous_Donation" tab
    When user click on "Title_dropdown" tab 
    When user click on "Mr" tab
    When user click on "First_Name" field 
    When user enters "<Firstname>" in the given text box in "firstname"       
    When user click on "Last_Name" field 
    When user enters "<Lastname>" in the given text box in "lastname"                       
    When user click on "Country" tab 
    When user click on "India" tab                 
    When user click on "State/Territory" tab 
    When user click on "NA" tab    
    When user click on "Address" field 
    When user enters "<Address>" in the given text box in "address"                            
    When user click on "City_field" field 
    When user enters "<City>" in the given text box in "city"                                     
    When user click on "Zip/PostalCode" field 
    When user enters "<Zip/PostalCode>" in the given text box in "zip"                        
    When user click on "Phone_Number" field 
    When user enters "<PhoneNumber>" in the given text box in "phone"                     
    When user click on "Email_Address" field 
    When user enters "<Email Address>" in the given text box in "email"
    When user click on "Make_My_Gift" tab    
    Then a new page pops up and the user  verifies the Complete Payment text and captures a screenshot     
Examples:
    |Firstname| Lastname   | Address|City     | Zip/PostalCode | PhoneNumber |Email Address        |
    |Tester   | TesterLast | 22     |Bangalore| 541312         | 9933445566  |alphatester@gmail.com|

