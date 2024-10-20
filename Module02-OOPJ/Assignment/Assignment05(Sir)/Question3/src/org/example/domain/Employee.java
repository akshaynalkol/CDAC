package org.example.domain;

public class Employee {
	private static int totalEmployees = 0;
	private static double totalSalaryExpense = 0.0;
	public static Employee arr[] = new Employee[10];
	private static int index = 0;
	private int empId;
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;

		Employee.totalEmployees++;
		Employee.totalSalaryExpense += salary;
		Employee.arr[Employee.index++] = this;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		totalSalaryExpense -= this.salary;
		this.salary = salary;
		totalSalaryExpense += salary;
	}

	public static int getTotalEmployees() {
		return Employee.totalEmployees;
	}

	public static void applyRaise(double percentage) {
		for (Employee emp : arr) {
			if (emp == null) {
				break;
			}
			double raiseAmount = emp.salary * (percentage / 100);
			emp.setSalary(emp.salary + raiseAmount);
		}
	}

	public static double calculateTotalSalaryExpense() {
		return Employee.totalSalaryExpense;
	}

	public void updateSalary(double newSalary) {
		this.setSalary(newSalary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
}
