package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Checked {
	   public static void main(String args[]) throws IOException
	   {
	      FileInputStream fis = null;
	      fis = new FileInputStream("Z:\\Web development.pdf"); 
	      int k; 

	      while(( k = fis.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
	      fis.close(); 	
	   }
	}

