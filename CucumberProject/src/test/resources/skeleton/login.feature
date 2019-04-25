Feature: Login Feature
@valid
Scenario Outline:Valid User Scenario
    Given The URL of TestMeApp
    When user enters <username> as username
    And user enters <password> as password
    Then user is in <page>
Examples:
|username|password|page|
|Lalitha|Password123|Home|
|admin|Password456|Admin Home|
@invalid
Scenario: invalid User Scenario
    Given The URL of TestMeApp
    When user enters invalid data
   |username|password|
|Lalitha|Password1238|
|admin8|Password456|
|adrtmin8|Password443556|

    Then user is in loginpage
    |Hello|
    |123|

    
    
    
#Scenario: Valid Admin User Scenario
  #  Given The URL of TestMeApp
 #   When user enters "admin" as username
 #   And user enters "Password456" as password
 #   Then user is in home page