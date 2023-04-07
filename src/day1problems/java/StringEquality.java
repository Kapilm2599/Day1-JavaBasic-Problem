package day1problems.java;

public class StringEquality {
	
	public static void main(String[] args) {
		
		String s1 = "Kapil";
		String s2 = "Kapil";
		String s3 = "Sagar";
		
		boolean val1 = s2.equals(s1);
		boolean val2 = s2.equals(s3);
		
		System.out.println("String 1 is equal to String 2: " + val1);
		System.out.println("String 2 is equal to String 3: " + val2);
		
	}

}
