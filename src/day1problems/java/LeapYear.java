package day1problems.java;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		System.out.println("Enter A Year:");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year%400 == 0) {
			System.out.println("It Is A Leap Year");
		}
		
		else if(year%4 == 0 && year%100!=0) {
			System.out.println("It Is A Leap Year");
		}
		
		else {
			System.out.println("Not A Leap Year");
		}
		
	}

}
