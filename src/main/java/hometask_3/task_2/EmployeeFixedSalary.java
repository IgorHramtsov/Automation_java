package hometask_3.task_2;

import hometask_3.task_1.MathRound;
import hometask_3.task_2.service.Salary;

public class EmployeeFixedSalary implements Salary {

    double FixedSalary;
    double Tax;

    EmployeeFixedSalary(double FixedSalary){
        this.FixedSalary = FixedSalary;
    }
    @Override
    public double salary() {
        return FixedSalary;
    }

    public double salary(double Tax){
        return MathRound.round10(FixedSalary*Tax);
    }


}
