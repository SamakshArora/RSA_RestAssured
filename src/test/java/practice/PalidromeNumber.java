package practice;

public class PalidromeNumber {


	public static void isPalindromeNumber(int num) {
		
		int a= 0;
		int sum =0;
		int t;
		
		t=num;
		while(num>0) {
			a=num%10;
			sum=(sum*10)+a;
			num=num/10;
			
		}
		if(t==sum) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not a Palindrome number");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  isPalindromeNumber(153);
	}

}
