package testing;

import java.util.HashMap;


public class test {
	
	static char maxOccurancechar(String str) {
		
		HashMap<Character, Integer> mp = new  HashMap<>();
		
		int n = str.length();
		
		
		char ans = 0;
		
		int count =0;
		
		for (int i = 0; i < n; i++) {
			
			char c = str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0)+1);
			
			if(count<mp.get(c)) {
				ans =c;
				count = mp.get(c);
			}
			
		}
		return ans;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabababa";
		System.out.println("max occurance is " + maxOccurancechar(str));
		
		
		

	}

}
