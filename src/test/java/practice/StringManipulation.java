package practice;

public class StringManipulation {
	public static void main(String[] args) {
		String s = "My project names is Automation Testing with selenium";
		String s1 = "My project names is automation Testing with selenium";
		//length of a string
		System.out.println(s.length());
		
		// character at 6 index
		System.out.println(s.charAt(6));
		
		// print o character index first occurrence
		System.out.println(s.indexOf("s"));
		
		
		// print o character index second occurrence
		int str = (s.indexOf("s", s.indexOf("s")+1));
		System.out.println(str);
		
		// print o character index third occurrence
				System.out.println(s.indexOf("s", str+1));
				
				
				System.out.println(s.indexOf("names"));
				
				System.out.println(s.indexOf("hello"));
				
				// string comparison
				System.out.println(s1.equals(s));
				
				System.out.println(s1.equalsIgnoreCase(s));
				
				
				// substring
				System.out.println(s.substring(0,12));
				
				
				// trim
				String st = "   hello world   ";
				System.out.println(st.trim());
				
				System.out.println(st.replace(" ", ""));
				
				// replace
				
				String date= "01-04-2024";
				System.out.println(date.replace("-", "/"));
				
				
				// split
				String test = "Selenium_java_maven_cucumber";
				String test1[]= test.split("_");
				for(int i=0;i<test1.length;i++) {
					System.out.println(test1[i]);
				}
				
	}
	

}
