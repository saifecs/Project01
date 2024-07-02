package com.saifyoussef.calculator;
import java.util.Scanner;



public class Application {

	public static void main(String[] args) {
		if (args.length > 0) {
			
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter operation (ex: addition, subtraction, multiplication, division, factorial):");
			String operation = scanner.next();
			
			
			switch (operation.toLowerCase()) {
			case "addition":
				System.out.println("Enter the first operand:");
				double a = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				double b = scanner.nextDouble();
				System.out.println("Result: " + addition(a , b));
				break;
			case "factorial":
				System.out.println("Enter a number:");
				double number = scanner.nextDouble();
				System.out.println("Result: " + factorial(number));
				break;
			case "subtraction":
				System.out.println("Enter the first operand:");
				double a1 = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				double b1 = scanner.nextDouble();
				System.out.println("Result: " + subtraction(a1 , b1));
				break;
			case "multiplication":
				System.out.println("Enter the first operand:");
				double a2 = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				double b2 = scanner.nextDouble();
				System.out.println("Result: " + multiplication(a2 , b2));
				break;
			case "division":
				System.out.println("Enter the first operand:");
				double a3 = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				double b3 = scanner.nextDouble();
				System.out.println("Result: " + division(a3 , b3));
				break;
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

}
	