@addition_test

Feature: calculator addition tests

  Background: Testing calculator with 3 parameters. Running before and after hooks.
  Scenario Outline: user gets result of 2 numbers. Type is operator telling the calculator what to do with those 2 numbers.
    Given calculator app is up and running
    When numA equals <a>
    And numB equals <b>
    And type equals <c>
    Then result should be equal <expectedResult>
    Examples:
      | a | b | c | expectedResult |
      | 1 | 1 | +| 2              |
      | 0 | 0 | + | 0              |
      | 1 | 2 | + | 3              |
      | 2 | 1 | + | 3              |
      | 1000 | 2000 | + | 3000     |
      | 2147483647 | 1 | + | 2147483648   |
      | 1 | 2147483646 | + | 2147483647   |
      | -1 | 2 | + | 1              |
      | 1 | -2 | + | -1              |
      | -1 | -2 | + | -3              |
      | -1000 | 2000 | + | 1000              |
      | 1000 | -2000 | + | -1000              |
      | -1000 | -2000 | + | -3000              |
      | 1 | 2 | + | 3              |







#  Scenario: user tries to get result sum of two numbers
#
#    Given calculator app is up and running
#    When num a equals -300
#    And num b equals 200
#    Then result should be equal -100
#
#
#  Scenario: user tries to get result sum of two numbers
#
#    Given calculator app is up and running
#    When num a equals -300
#    And num b equals 200
#    Then result should be equal 10
