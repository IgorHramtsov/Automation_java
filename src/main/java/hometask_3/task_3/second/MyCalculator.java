package hometask_3.task_3.second;

import hometask_3.task_3.first.Numerable;

public class MyCalculator implements Numerable {

    private double firstNumber;
    private double secondNumber;

    public MyCalculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double divide() {
        return firstNumber / secondNumber;
    }
    @Override
    public double minus() {
        return firstNumber - secondNumber;
    }
    @Override
    public double multiply() {
        return firstNumber * secondNumber;
    }

    @Override
    public double plus() {
        return firstNumber + secondNumber;
    }
}
