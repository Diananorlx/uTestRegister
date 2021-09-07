@Stories
Feature: Register on the website
  As a user, I want to register as a new user on the Utest website

  @Scenario:
  Scenario Outline: : New user who is not registered
    Given than a user called Diana who enters the test page and click the register button
    When she Diligence the form
      | first_name    | last_name   | email_address   | month   | day   | year   | city   | zip   | country_a   | computer_a   | version_a   | language_a   | mobile    | model   | operating    |  password    | confirm_password   |
      | <first_name>  | <last_name> | <email_address> | <month> | <day> | <year> | <city> | <zip> | <country_a> | <computer_a> | <version_a> | <language_a> |  <mobile> | <model> | <operating>  |  <password>  | <confirm_password> |
    Then it is registered on the web


    Examples:
      | first_name | last_name | email_address    | month  | day   | year| city     | zip     | country_a    | computer_a  | version_a | language_a | mobile   | model | operating   | password     | confirm_password     |
      | Diana      | Guevara   | dd.ng@gmail.com  | August | 16    | 1993| Bogotá  | 1100111 | Colombia     | Windows     | 7         | Spanish    | HP       | Veer  | Android 4.0 | Clave.12345+ | Clave.12345+         |