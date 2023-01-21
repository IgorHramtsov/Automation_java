package hometask_3.task_2;

public class Main {

    public static void main(String[] args) {

        EmployeeFixedSalary employeeFixedSalary = new EmployeeFixedSalary(44985.3);
        EmployeeSalaryPerHour employeeSalaryPerHour = new EmployeeSalaryPerHour(156.3, 168);

        System.out.println("Monthly fixed salary before taxes = " + employeeFixedSalary.salary() + "uah");
        System.out.println("Monthly salary per hour before taxes = " + employeeSalaryPerHour.salary() + "uah");

        System.out.println("Monthly fixed salary after taxes = " + employeeFixedSalary.salary(0.805) + "uah");
        System.out.println("Monthly salary per hour after taxes = " + employeeSalaryPerHour.salary(0.805) + "uah");

    }
}
