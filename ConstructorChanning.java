package oopsConcepts;

public class ConstructorChanning {
	
	int id;
	String name;
	double salary;
	ConstructorChanning() {
		this(100);
	}
	
	ConstructorChanning(int id) {
		
		this(id,"alekha");
	}
	ConstructorChanning(int id, String name) {
		this(id,name,20000.00);
		
	}
	ConstructorChanning(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
	public static void main(String[] args) {
		ConstructorChanning t1 = new ConstructorChanning();
		t1.display();
	}

}
