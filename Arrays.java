import java.util.Scanner;

public class Arrays {

	private static final String countine = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int temp;
		int n = sc.nextInt();
		int [] a = new int [n];
		for( i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
			if(a[i]==5) {
				
			}
		}
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]<a[j]  ) {
			 temp = a[i];
			a[i] =a[j];
			a[j] = temp;
		}
		}
		}
		for( i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	}
