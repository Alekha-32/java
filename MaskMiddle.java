package LogicalPrograms;

public class MaskMiddle {

	public static String muskcard(String str) {
		
		if(str.length() < 4) {
			return str;
		}
		else {
			// Hide front value 
			String res = "";
			for(int i=0;i<str.length();i++) {
				if( i < str.length()-4) {
					res += "#";
				}
			}
			res += str.substring(str.length()-4);
			
			
			// print middle values hide
		//	res = str.substring(0,str.length()-10);
		//res += "####";        
			//res += str.substring(10,str.length());
			
			
			
			
			
		//	res = str.substring(0,str.length()-4); //print last values hide
		//	res +="####";
			
			
			
			return res;
		}
		
	
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	//	MaskMiddle m = new MaskMiddle("4556364607935616");
		System.out.println(MaskMiddle.muskcard("1478128816325010"));
		System.out.println(MaskMiddle.muskcard("4556364607935616"));
		System.out.println(MaskMiddle.muskcard("64607935616"));
		System.out.println(MaskMiddle.muskcard("1"));
		System.out.println(MaskMiddle.muskcard(""));
	
		
	}

}
