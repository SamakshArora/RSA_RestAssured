package practice;

public class ReverseString {
	public static void main(String[] args) {
		// reverse using loop
		String s = "Samaksh";
		String rev = "";
	
		for (int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
		
		}
		System.out.println(rev);
		
		
		//String buffer
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
		
	
	}

	
	
}

