package org.example.main;

import java.util.Scanner;
import org.example.domain.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n===== Employee Management System =====");
			System.out.println("1. Add Employee");
			System.out.println("2. View Total Employees");
			System.out.println("3. Apply Salary Raise to All Employees");
			System.out.println("4. View Total Salary Expense");
			System.out.println("5. Update Employee Salary");
			System.out.println("6. Display All Employees");
			System.out.println("7. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Employee ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Employee Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Employee Salary: ");
				double salary = scanner.nextDouble();
				Employee newEmployee = new Employee(id, name, salary);
				System.out.println("Employee added: " + newEmployee); //newEmployee.toString();
				break;
			case 2:
				System.out.println("Total Employees: " + Employee.getTotalEmployees());
				break;
			case 3:
				System.out.print("Enter percentage raise to apply: ");
				double percentage = scanner.nextDouble();
				Employee.applyRaise(percentage);
				System.out.println("Salary raise applied to all employees.");
				break;
			case 4:
				System.out.println("Total Salary Expense: Rs" + Employee.calculateTotalSalaryExpense());
				break;
			case 5:
				System.out.print("Enter Employee ID to update salary: ");
				int updateId = scanner.nextInt();
				for (Employee emp : Employee.arr) {
					if (emp.getEmpId() == updateId) {
						System.out.print("Enter new salary: ");
						double newSalary = scanner.nextDouble();
						emp.updateSalary(newSalary);
						System.out.println("Salary updated: " + emp);
						break;
					}
				}
				break;
			case 6:
				for (Employee emp : Employee.arr) {
					if (emp == null) {
						break;
					}
					System.out.println(emp); // emp.toString();
				}
				break;
			case 7:
				System.out.println("Exiting program...");
				scanner.close();
				System.exit(0);
				// return;

			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

}
