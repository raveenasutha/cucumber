Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
   # Given user launch the url
    
    #When user give the valid details
     # |fname|raveena|
      #|lname|sutha|
      #|email|raveenakolanthaivel@gmail.com|
      #|address|chennai|
      #|phno|9994313218|
   
    # And user can find the customerID
    # |cusID|
    # Then user can validate the outcomes
    
    
     Scenario: Title of your scenario
    Given user launch the url
    
    When user give the valid details"<fname>","<lname>","<email>","<address>","<phno>"
   
   
    And user can find the customerID
   
    Then user can validate the outcomes
    
    
    
    Examples:
    
      |fname             |name       |email                 |address     |phno        |
      |sutha             |raveena     |raveena@gmail.com     |chennai     |1234567890  |
      |raveenagokul      |suthamenaga |raveenasutha@gmail.com|namakkal    |234567890987|
      |ravisutha         |suthagar    |suthagar@gmail.com    |metukuppam  |98765432345 |
    
    