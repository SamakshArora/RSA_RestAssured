package practice;


import java.util.Arrays;
import java.util.Collections;

public class practice {



	public void ispalidrome(int num) {

		int a = 0;
		int sum = 0;
		int t= 0;
		System.out.println("Actual Number = "+ num);
		t=num;
		while (num>0) {
			a=num%10;
			sum = (sum*10)+a;
			num= num/10;


		}
		if(t==sum) {

			System.out.println("Is Palidrome number");

		}
		else {
			System.out.println("Not a Palidrome number");
		}




	}



	public void Smallest_largest() {

		System.out.println(" ");
		int arr[]= {50,70,10,5,3,-2,90};

		int smallest = arr[0];
		int largest = arr[0];

		for(int i=1;i<arr.length;i++) {
			if (arr[i]>largest) {
				largest= arr[i];

			}
			else if (arr[i]<smallest) {
				smallest = arr[i];

			}
		}
		System.out.println("Array is = "+Arrays.toString(arr));
		System.out.println("Smallest num = "+smallest);
		System.out.println("Largest num = "+largest);
	}

	public void reverseString(String S ) {
		System.out.println(" ");

		String rev="";
		for(int i=S.length()-1;i>=0;i--) {
			rev=rev+S.charAt(i);

		}
		System.out.println("Actual String == "+S);
		System.out.println("reverse String == "+rev);

	}


	public void duplicateElementInArray( ) {
		System.out.println(" ");


		String arr[]= {"JAVA","Javasript","C++","JAVA","Ruby","C++"};
		System.out.println("Actaul Array"+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==(arr[j])){
					System.out.println("Duplicate element is array is =="+arr[i]);
				}

			}

		}		
	}
	public void sortingArray() {
		System.out.println(" ");

		int arr[] = { 0,0,1,0,1,0,0,1};
		System.out.println("Actaul Array = "+Arrays.toString(arr));
		int temp= 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;


				}
			}

		}
		System.out.println("Sorting Arrray = "+Arrays.toString(arr));
		
	}
	

	public void reverseWordsInArray(String S) {
		String words[]= S.split(" ");
		String reverseString="";
		for (int i = 0; i < words.length; i++) {
		String	word=words[i];
		String reverseword="";
		for (int j = word.length()-1; j >=0 ; j--) 			{
			reverseword=reverseword+word.charAt(j);
		}
			reverseString=reverseString+reverseword+ " ";
			
			
			
		}
		System.out.println(S);
		System.out.println(reverseString);
		System.out.println("----------------");
		}
		
	

	public void sum( ) {
		int arr[] = {1,2,4,6,10};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
		  sum= sum+arr[i];
		}
		System.out.println(sum);
		}
		
	 public void print2largest(Integer arr[])
	    {
	        // Sort the array in descending order
	        Arrays.sort(arr, Collections.reverseOrder());
	        // Start from second element as first
	        // element is the largest
	        for (int i = 1; i < arr.length; i++) {
	            // If the element is not
	            // equal to largest element
	            if (arr[i] != arr[0]) {
	                System.out.printf("The second largest "
	                                      + "element is %d\n",
	                                  arr[i]);
	                return;
	            }
	        }

	        System.out.printf("There is no second "
	                          + "largest element\n");
	    }


	public static void main(String[] args) {
		practice a = new practice();

		// Check palidrome
		a.ispalidrome(1221);


		// Check Largest smallest number
		a.Smallest_largest();


		// Check reverse string
		a.reverseString("Samaksh Arora");

		// Check Check Duplicate Element in array
		a.duplicateElementInArray();

		// Check Check Duplicate Element in array
		a.sortingArray();
		
		
		// reverse Words In a Array
		a.reverseWordsInArray("Samaksh Arora");
		
		
		// sum of an array
		a.sum();
		
		Integer arr[] = { 12, 35, 1, 10, 34, 1 };
		a.print2largest(arr);


	}

}
