package oopsConcepts;

 class Constructor {
	 int id;
	 String name;
	 double salary;
	 public Constructor(int id, String name, double salary) {
	this. id = id;
	 this.name = name;
	 this.salary = salary;
 }

	
	  Constructor(int id, String name) { // Constructor Overloading
		  this.id = id;
	  this.name = name; }
	 
	  Constructor(int id) {
		  this.id = id;
	  }
	 
public void display() {
	System.out.println(id+" "+name+" "+salary);
	
}
public static void main(String[] args) {
	Constructor t1 = new Constructor(1,"Alekha",1000.00);
	Constructor t2 = new Constructor(1,"jaijai");
	Constructor t3 = new Constructor(1);
	
	//t1.id = 100;
	t3.display();
	
	t1.display();
	t2.display();
}

}
