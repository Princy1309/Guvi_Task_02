package question_1;

public class Person {
	
	// Properties
	String name;
	
	int age;
	
	
	 // Default constructor - sets default age as 18
	public Person(String name) {
		
		this.name=name;
		
		this.age=18;
	}
	
	
	// Parameterized constructor - user sets name and age
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	// Method to display name and age
	
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	
	
	// Main method to test the class
	public static void main(String[] args) {

		// Using default age
		
		Person p1=new Person("Princy");
		p1.display();

		// Using custom age
		
		Person p2= new Person("Nayagi",20);
		p2.display();
	
	}

}
