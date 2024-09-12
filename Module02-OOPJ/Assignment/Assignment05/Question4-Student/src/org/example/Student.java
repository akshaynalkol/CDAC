package org.example;

public class Student {
	private String name;
	private int rollNo;
	private String grade;

	public Student() {
		this("", 0, "");
	}

	public Student(String name, int rollNo, String grade) {
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "\n----- Student Details -----\nName : " + this.name + "\nRoll No : " + this.rollNo + "\nGrade : "
				+ this.grade+"\n";
	}

}
