package practice;

import java.util.Arrays;

public class LargetAndSmalllestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int  numbers[]= {10,-5,20,50,-65,54,0};
		int largest = numbers[0];
		int smallest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if (numbers[i]<smallest) {
				smallest=numbers[i];		
			}
		}
		
		System.out.println("Array = "+ Arrays.toString(numbers));
		System.out.println("largest number ="+ largest);
		System.out.println("smallest number ="+ smallest);
	}
	

}
