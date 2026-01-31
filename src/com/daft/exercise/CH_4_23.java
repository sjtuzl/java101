package com.daft.exercise;
import java.util.Scanner;
//financial application: payroll
public class CH_4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double workHours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();
        double grossPay = workHours * payRate;
        double federal = federalRate * grossPay;
        double state = stateRate * grossPay;
        double netPay = grossPay - federal - state;
        System.out.println("\n" + "Employee Name: " + name);
        System.out.println("Hours Worked: " + workHours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:" + "\n" + "  Federal Withholding (" + federalRate * 100 + "%): $" + federal);
        System.out.println("  State Withholding (" + stateRate * 100 + "%): $" + state);
        System.out.println("  Total Deduction: $" + (federal + state));
        System.out.println("Net Pay: $" + netPay);
    }
}
