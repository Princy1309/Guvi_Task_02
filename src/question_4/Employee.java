package question_4;

public class Employee extends Person{

	int employeeID;
	double salary;
	
	
	// Constructor for Employee
	
	public Employee(String name, int age, int employeeID,double salary ) {
		super(name,age);
		this.employeeID=employeeID;
		this.salary=salary;
	}
	
	 // Method to display employee info
	
	public void display() {
		System.out.println("Employee Name : "+name);
		
		System.out.println("Employee Age : "+age);
		
		System.out.println("Employee ID : "+employeeID);
		
		System.out.println("Employee salary : "+salary);
	}
	
	
	public static void main(String[] agrs) {
		
		Employee emp=new Employee("Princy",20,1,80000);
		emp.display();
		
	}
	
	
	
}
