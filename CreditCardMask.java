package LogicalPrograms;

public class CreditCardMask {
		public static String Maskify(String str) {

			  if (str.length() < 4) {
		            return str;
		        } 
			  else {
		            String res = "";
		            for (int i = 0; i < str.length(); i++) {
		                if (i < str.length() - 4) {
		                   res += "#"; //#### #### ####
		                }
		            }
		            res += str.substring(str.length() - 4); //5616
		            return res; //#### #### #### 5616
		        }

	
			//	res = str.substring(0,str.length()-4); // 455636460793
			//	res += "####"; //last four digits ####
			///	return res; //45563640793####
			}

	
		

		public static void main(String[] args) {
		System.out.println(CreditCardMask.Maskify("4556364607935616")); // should return "############5616"
		
		  System.out.println(CreditCardMask.Maskify("64607935616"));
		  System.out.println(CreditCardMask.Maskify("145785"));
		  System.out.println(CreditCardMask.Maskify("1 "));
		  System.out.println(CreditCardMask.Maskify(""));
		              
		
		
		}
		}


