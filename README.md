# RyanAir

The automation framework consists of the following technologies:
1. Java
2. Maven 
3. Junit
4. Page Object Model
5. Reporting and logging: Extent Reports.
6. Cucumber
7. Logging of each step.
8. Screenshots of the checkpoints.


-------------------------------------



**Steps to run the script:**
1. **Clone the GitHub Repository.**
2. **Import the Maven Project.**
3. **Run the project. (Run-> Maven test). This is automatically run the Cucumber Runner file and execute the script.**
4. **Reports should be saved in the following location: /Users/<username>/git/RyanAir/report.html**
    
    
    
 -------------------------------------
    
    



**Pre-conditions:**
1. Only valid data should be given to the script.
2. No. of Plus Seats should be available for booking.
3. Chrome should be installed (tested on the latest version).
4. All the data other than the data from the Data Table will be generated by the script.


**Framework details:**

There are 7 main components of the framework:

1. Page Objects: -  **com.mytest.automation_ryanair.Pages**
    - Page Object classes will contain all the web element paths and their description. The description will be later used for logging. These classes will return the object of Page.java class. The Page.java class will also contain all the operation function for the web elements.
    
2. Page Function: -  **com.mytest.automation_ryanair.PageFunctions**
    - Page Function classes will contain the functions for the web pages. These classes will extend their Page classes and inherit all the Page element. 
    
3. Step Defination: -  **com.mytest.automation_ryanair.myStepDefination**
    - Step Definition will call the operations from the Page Function classes by creating objects. They will also pass the driver session and data to the Page function classes.
    
4. Reporting and logging: -  **RyanAir/report.html**
    - Reporting will be done during each transaction on the Web Element. On every checkpoint, screenshot will be taken and added to the report.
   
5. Driverclass: -  **com.mytest.automation_ryanair.myStepDefination.DriverClass.java**
    - This file is to create the initial driver. Also the implicit waits as initialized here.
    
6. Feature File: **automation-ryanair/src/test/resource/featues/testcases.feature**
    - Contains the BDD cases.
    
7. Runner File: **com.mytest.automation_ryanair.runner**
    - Contains the file for running the feature files.


-------------------------------------


**Sample BDD:**

Feature: Card Decline

@tag1

    Scenario Outline: Verify Error Message For Invalid Card Data
    
    Given I am logged in to the application with <username> and <password>
    
    And I make a booking from <source> to <destination> on <date> for <no_adults> , <no_teen> and <no_child>
    
    When I pay for booking with card details <card_number> , <card_type> , <card_exp_month> , <card_exp_year> , <card_cvv> and <card_holder>
    
    Then I should get payment declined message

    Examples: 
      | username              | password | source | destination | date       | no_adults | no_teen | no_child | card_number      | card_type  | card_exp_month | card_exp_year | card_cvv | card_holder |
      | testkiprosh@gmail.com | Test@123 | Madrid | Dublin      | 07/12/2018 |         2 |       1 |        1 | 5555555555555557 | MasterCard |             10 |          2019 |      265 | Pika Pika   |


-------------------------------------


Report Snapshot:

https://ibb.co/gvTNnK

https://ibb.co/eSg3uz


-------------------------------------



**Video recording of the execution process:**

https://www.useloom.com/share/6629f207886a40429acce716197a4188



-------------------------------------

**Comments:**

**Note 1 : I noticed some random issues in the application:**

1. After selecting the Flight, the Seat selection window is sometimes not loaded. We need to refresh the page and restart the entire process.
2. The checkout button gets stuck sometimes. We need to go back and reselect the seats and retry checkout.
3. Sometimes no flights are shown for valid itinerary data. After restarting the browser, the flights are shown again. (maybe cache issue).
https://www.awesomescreenshot.com/image/3624748/a38a54a234ffff7fe104a6ad66d9a9e4



**Note 2: Some of the customer data is hardcoded.**

This is just for demo purpose. In real automation, we can easily use a config file or Data table or any other data storage method to make it data-driven.
