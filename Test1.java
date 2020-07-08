package Strings;

public class Test1 {
	public static void main(String[] args) {
		String str = "Alekhachowdary joined as a intern in full creative  ";
		String str1 = "Alekhachowdary joined as a intern in full creative  ";
		String str5 = new String("Alekhachowdary joined as a intern in full creative  \";");
		char[] ch = {'a','l','e','k','h','a'};
		System.out.println(ch.length);
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("joned"));
		System.out.println(str.length());
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(2));
		String s1 = new String(ch);
		System.out.println(s1);
		System.out.println(str.contains("Alekhachowdary"));
		System.out.println(str.contains("you"));
		String s6 = str.trim();
		System.out.println(s6.length());
		System.out.println(s6);
		}

}
