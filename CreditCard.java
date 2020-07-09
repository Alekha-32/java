package LogicalPrograms;

import java.io.IOException;

public class CreditCard {
	
	public static String HideNum(String str) throws IOException {
	
	  if(str.length() < 4) { 
		 return str;
		  }
	  else {
		  String res ="";
	  res = str.substring(0,str.length()-4);
	 res +="####";
	 return res;
	  }
}

	
	
	
	public static void main(String[] args) throws IOException {
		System.out.println(HideNum("2545789678561234"));
	}
}
