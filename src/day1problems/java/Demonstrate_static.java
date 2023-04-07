package day1problems.java;

public class Demonstrate_static {
	   static int x = 10;		//demonstration static variable
	   static int y;
	   
	   //demonstration static method
	   static void func(int z) {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   
	   // demonstration Static block
	   static {
	      System.out.println("Running static initialization block.");
	      y = x + 5;
	   }
	   public static void main(String args[]) {
	      func(8);
	   }

}
