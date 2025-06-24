package hometask_15;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setCalculator() {
        calculator = new Calculator();
        System.out.println("new calculator");
    }

    @Test(groups = {"groupName1"})
    @Parameters("parameter")
    public void additionTest(@Optional("Default")String parameter) {

        int a = 5;
        int b = 9;
        int expectedResult = 14;
        int actualResult = calculator.add(a, b);

        System.out.println(parameter);

        Assert.assertEquals(actualResult, expectedResult, "addition failed");
    }

    @Test(groups = {"groupName1"})
    @Parameters("parameter")
    public void substractionTest(@Optional("Default")String parameter) {

        int a = 12;
        int b = 8;
        int actualResult = calculator.substract(a, b);
        int expectedResult = 4;

        System.out.println(parameter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = {"groupName2"})
    @Parameters("parameter")
    public void multiplyTest(@Optional("Default")String parameter) {

        int a = 5;
        int b = 8;
        int actualResult = calculator.multiply(a, b);
        int expectedResult = 40;

        System.out.println(parameter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = {"groupName2"})
    @Parameters("parameter")
    public void divideTest(@Optional("Default")String parameter) {

        int a = 72;
        int b = 9;
        int actualResult = calculator.divide(a, b);
        int expectedResult = 8;

        System.out.println(parameter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = {"groupName3"})
    @Parameters("parameter")
    public void percentTest(@Optional("Default")String parameter) {

        double a = 25;
        double b = 250;
        double actualResult = calculator.percent(a, b);
        double expectedResult = 10;

        System.out.println(parameter);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
