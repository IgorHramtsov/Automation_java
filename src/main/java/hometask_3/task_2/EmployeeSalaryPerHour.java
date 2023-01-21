package hometask_3.task_2;

import hometask_3.task_1.MathRound;
import hometask_3.task_2.service.Salary;

public class EmployeeSalaryPerHour implements Salary {

    double SalaryPerHour;
    double WorkedHours;
    double Tax;

    EmployeeSalaryPerHour(double SalaryPerHour, double WorkedHours){
        this.SalaryPerHour = SalaryPerHour;
        this.WorkedHours = WorkedHours;
    }
    @Override
    public double salary() {
        return SalaryPerHour*WorkedHours;
    }

    public double salary(double Tax){
        return MathRound.round10(SalaryPerHour*WorkedHours*Tax);
    }
}
