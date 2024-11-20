package practice;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "@#@$# JAVA !#$@#$ 123456 #$$@ donoc";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
	}

}
