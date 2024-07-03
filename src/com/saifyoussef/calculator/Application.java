package com.saifyoussef.calculator;
import java.util.Scanner;



public class Application {

	public static void main(String[] args) {
		if (args.length > 0) {
			
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter operation (ex: addition, subtraction, multiplication, division, factorial):");
			String operation = scanner.next();
			// displays options to user and collects input
			
			double a = 0;
			double b = 0;		
			switch (operation.toLowerCase()) {
			case "addition":
				System.out.println("Enter the first operand:");
				 a = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				 b = scanner.nextDouble();
				System.out.println("Result: " + addition(a , b));
				break;
				// performs add operation
			case "factorial":
				System.out.println("Enter a number:");
				double number = scanner.nextDouble();
				System.out.println("Result: " + factorial(number));
				break;
				// performs factorial operation
			case "subtraction":
				System.out.println("Enter the first operand:");
				 a = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				 b = scanner.nextDouble();
				System.out.println("Result: " + subtraction(a , b));
				break;
				// performs subtraction operation
			case "multiplication":
				System.out.println("Enter the first operand:");
				 a = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				 b = scanner.nextDouble();
				System.out.println("Result: " + multiplication(a , b));
				break;
				// performs multiplication operation
			case "division":
				System.out.println("Enter the first operand:");
				 a = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				 b = scanner.nextDouble();
				System.out.println("Result: " + division(a , b));
				if ( b == 0) {
					throw new IllegalArgumentException("enter a nonzero digit");
					
					
				}
				
				break;
				
				// performs division operation
			}
			}
		}

	
	
	
	

	public static double addition(double a, double b) {
		return a + b;
	}
	 
	public static double subtraction(double a, double b) {
		return a - b;
		
	}

	public static double multiplication(double a, double b) {
		return a * b;
		
	}
	
	public static double division(double a, double b) {
		return a / b;
	}
	
	public static double factorial(double n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
// defines methods
}
	