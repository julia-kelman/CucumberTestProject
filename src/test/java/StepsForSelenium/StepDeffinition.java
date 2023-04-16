package StepsForSelenium;

import app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.*;

public class StepDeffinition {

    private Calculator calculator;
    int numA;
    int numB;
    String typeC;

    @Given("calculator app is up and running")

    public void startCalc(){
        calculator=new Calculator();
        System.out.println("Calc is on");

    }

    @When("numA equals {int}")
    public void numAEquals(int a) {
        numA=a;
        System.out.println("first  num is "+ a);

    }

    @And("numB equals {int}")
    public void numBEquals(int b) {
        numB=b;
        System.out.println("second num is " + b);
    }

//THE PROBLEM IS HERE : IS THIS CORRECT  {String}??
    @And("type equals {String}")
    public void typeEqualsC(String c) {
        typeC=c;
        System.out.println("type is " + c);

    }

    @Then("result should be equal {int}")
    public void resultShouldBeEqual(int expectedResult) {

        int actualResult= calculator.calculate(numA, numB, typeC);
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
        System.out.println(expectedResult);
    }


}
