package practice;

import java.util.Arrays;
import java.util.Iterator;

public class practice2 {

	public static void main(String[] args) {
		ispalidrome(121);
		ispalidrome(123);
		ispalidrome(444);
		
		
		revString("Samaksh Arora");
		
		String arr[]={"JAVA","Javasript","C++","JAVA","Ruby","C++"};
		duplicateElemnt(arr);
		
		
		int arr1[]={0,0,1,0,1,0,0,1};
		
        arrSort(arr1);
        
int arr3[]={50,70,10,5,3,-2,90};
		
        smalledandlargest(arr3);
	}

	
	
	public static void ispalidrome(int num) {
		int a = 0;
		int sum=0;
		int temp=0;
		
		temp=num;
		
		while(num>0) {
			a=num%10;
			sum=(sum*10)+a;
			num = num/10;
			
					
		}
		if(temp==sum) {
			System.out.println("is a plaidrome number");
		}
		else {
			System.out.println("not a plaidrome number");
		}
	}
	
	
	public static void revString(String S) {
	
	String rev="";
	for(int i=S.length()-1;i>=0;i--) {
		rev=rev+S.charAt(i);
		
	}
	
	System.out.println(rev);
}
	
	
	public static void duplicateElemnt(String arr[]) {
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==(arr[j])){
				System.out.println("Duplicate elements are "+arr[i]);
			}
		}
		
	}
	
}
	
	
	public static void arrSort(int arr[]) {
		int temp=0;
		
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		
	}
	System.err.println("Sorted array"+Arrays.toString(arr));
	}
	
	public static void smalledandlargest(int arr[]) {
		int smallest = arr[0];
		
		int largest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];

			}else if (arr[i]<smallest) {
				smallest = arr[i];
			}
			
		}
		
		System.out.println("Largest number = "+ largest);
		System.out.println("Smallest number = "+ smallest);
}
}