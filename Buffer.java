package Strings;

public class Buffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Hello");
	//sb.append("java");
	
	sb.replace(1,3, "java");
	sb.reverse();
	
	System.out.println(sb);
}
}
