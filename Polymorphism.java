package oopsConcepts;
// method overloading
public class Polymorphism { 
	int sum;
public void display(int a, int b, int c) {
  sum = a+b+c;
  System.out.println(sum);
}
public void display(int a, int b, int c, int d) {
	sum = a+b+c+d;
	System.out.println(sum);
}
public void display(int t, char c) {
	System.out.println("the methods combines with int and char");
}




	 public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.display(10,20,30);
		p.display(10,20,30,40);
		p.display(1,'g');
		 
	 }
	
	
	
	

}
