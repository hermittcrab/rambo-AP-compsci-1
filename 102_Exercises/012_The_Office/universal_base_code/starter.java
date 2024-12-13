/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		Dwight.raiseSalary(25);
		double x = Dwight.getAnnualSalary();
		System.out.println(x);
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		
		Employee Pam = new Employee(1987, "Pam", "Beesly", 2250.0);
		Pam.employeeToString();
		
		Employee Rambo = new Employee(1234, "Rambo", "Bambo", 10.0);
		Rambo.employeeToString();
		
	}
		
}

