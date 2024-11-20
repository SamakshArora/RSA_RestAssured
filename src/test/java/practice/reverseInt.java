package practice;

public class reverseInt {
	public static void main(String[] args) {
		
		//first method
		int  num = 123458;
		 int rev= 0;
		 while(num!=0) {
			 rev = rev *10  + num % 10;
			 num= num/10;
		 }
		 System.out.println(rev);
		 
		 
		 // second method
		int  num1=4321;

		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		
		int n = 3456;
		int ver =0;
		while(n!=0) {
			ver=ver*10+n%10;
			n=n/10;
		}
		System.err.println(ver);
	}
	

	
	
}
