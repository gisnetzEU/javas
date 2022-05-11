package exampleColaborativeTest1;

public class Employee extends Person {
	
	//Attributes
	protected double salaryEmployee;
	
	//Constructors
	public Employee() {}
	public Employee(String name) {
		super(name);
	}
	public Employee(String name, int age) {
		super(name, age);
	}
	public Employee(String name, int height, int weight) {
		super(name, height, weight);
	}
	public Employee(String name, int day, int month, int year) {
		super(name, day, month, year);
	}
	public Employee(String name, int day, int month, int year, double basicSalary, double salaryEmployee) {
		super(name, day, month, year);
		this.basicSalary = basicSalary;
		this.salaryEmployee = salaryEmployee;
	}
	
	
	//Methods
	@Override
	public double getSalary() {
		return this.getBasicSalary() + this.salaryEmployee;
	}
	
	
	//toString
	@Override
	public String toString() {
		return super.toString()
		+ "\nSalary as employee: " + salaryEmployee + ".";
	}
	
	
	//Getter and Setters
	public double getSalaryEmployee() {
		return salaryEmployee;
	}
	public void setSalaryEmployee(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}
	
	
	
	
}
