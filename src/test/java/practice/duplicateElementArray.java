package practice;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1st  Compare method 0[nxn] worst method
		String a[]= {"JAVA","Javasript","C++","JAVA","Ruby"};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					System.out.println("duplicate Element In Array ="+a[i]);			
				}
				
			}
			
		}

		
		
		//2nd hashset method
		Set<String> store = new HashSet<String>();
		for(String names:a) {
			if(store.add(names)==false) {
				System.out.println("duplicate Element In Array ="+names);
			}
		}
		

	}

}
