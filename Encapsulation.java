package oopsConcepts;

class Student {

	private String Name;
	private int id;
	private Long salary;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(long i) {
		this.salary = i;
	}
}
  public class Encapsulation  {
public static void main(String[] args) {
	
Student sc = new Student();
sc.setName("Alekha");
sc.setId(2);
sc.setSalary(10000);


System.out.println(sc.getName());
System.out.println(sc.getId());
System.out.println(sc.getSalary());
	
}
}