#Author: hailihan2001@gamil.com
Feature: QA Technical Test for IT

  @Login
  Scenario: login website with valid user
    Given Open web browser and start with url "https://insighttimer.com/"
    When I login with my valid username with password
 #     | name | password  |
#      | han.helen8+05@gmail.com | Passw0rd |
    Then the vaild user login successfully
    Then publish new content successfuly
    

  @LoginInvaildUser
  Scenario: login website with invaild user
    Given Open web browser and start with url "https://insighttimer.com/"
    When I login with my invalid username with password
      | name     | password    |
      | E(*dcrf@ | WSEDCVF$%^& |
    Then the invaild user can not login successfully

  @CreatedUser
  Scenario: Create Employee
    Given Open web browser and start with url "https://insighttimer.com/"
    When I login with my valid username with password
      | name | password  |
      | Luke | Skywalker |
    Then the vaild user login successfully
    And Create createEmployee successfully
      | firstname  | lastname | startdate  | email           | status |
      | Tom001     | Pasdid   | 2009-09-09 | test01@test.com | passed |
      | Tom002     | shelda   | 2008-09-09 | test02@test.com | passed |
      | @WSX#$%%^& | QA$%^&*( | 2011-09-09 | test03@test.com | failed |
    And I fill in blank data I can see the tip message

  @EditdAndDelUser
  Scenario: Edit Employee and delete Employee
    Given Open web browser and start with url "https://insighttimer.com/"
    When I login with my valid username with password
      | name | password  |
      | Luke | Skywalker |
    Then I select one user and click the Edit Btn to Edit User
    And I select one user and delete the user when edit
    And I select the test user and click to delete the user
