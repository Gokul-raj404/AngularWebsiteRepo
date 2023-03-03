Feature: Sign-in to Forbes website.
  I want to use this template for my feature file

  Background: 
    Given I am launching the browser

  	@Forbes
  Scenario Outline: Positive test for signing in to the website
    Given user is on the Forbes login page <BaseURL>
    When user enters emailID <emailID> and password <password>
    Then I verify the account holders name <accHolder>
    
     Examples: 
      | BaseURL                                 | emailID                | password        | accHolder    |
      | https://www.forbes.com/?sh=704076982254 | gookulraj404@gmail.com | IvarViking@2k21 | Hello, Gokul |
    
    
    @Forbes
  Scenario Outline: Negative test for signing in to the website
    Given user is on the Forbes login page <BaseURL>
    When user enters emailID <emailID> and password <password>
    Then I verify the account holders name <accHolder>

     Examples: 
      | BaseURL                                 | emailID                | password        | accHolder    |
      | https://www.forbes.com/?sh=704076982254 | gookulraj404@gmail.com | IvarViking@2k21 | Hello, Sandeep |

      
      
    @Samsung
  Scenario Outline: Purchasing a product on Samsung website
    Given user is on the samsung login page <BaseURL>
    When user enters SamsungSite emailID <emailID> and password <password>
    

     Examples: 
      | BaseURL                     | emailID                | password        |
      | https://www.samsung.com/in/ | gookulraj404@gmail.com | samsung@2k21		 |
    