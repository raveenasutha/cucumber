
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
    Given user can launch the url
    When user can enter the valid details
     |fname|raveena|
      |lname|sutha|
      |email|raveenakolanthaivel@gmail.com|
      |address|chennai|
      |phno|9994313218|    
    And some can valid the customer ID
    |cusID|   
    Then user can valid the outcomes
  
 Scenario Outline: 
    Given user can launch the url
    When user can enter the valid details"<fname>","<lname>","<email>","<address>","<phno>"     
    And some can valid the customer ID    
    Then user can valid the outcomes
   
   Examples:
     |fname         |lname       |email                  |address   |phno|
      |sutha        |raveena     |raveena@gmail.com      |chennai   |1234567890|
      |raveena      |suthamenaga |raveenasutha@gmail.com |namakkal  |234567890987|
      |ravisutha    |suthagar    |suthagar@gmail.com     |metukuppam|98765432345|
  


     