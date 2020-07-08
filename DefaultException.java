package exception;

public class DefaultException {
	private void m1() {
		m2();
		//System.out.println("alekha");
	}
	private void m2() {
		m3();
		//System.out.println("Chowdary");
	}
	private void m3() {
		int a = 5/0;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	  DefaultException a1 = new DefaultException();
	  a1.m1();
	  
	}

}
