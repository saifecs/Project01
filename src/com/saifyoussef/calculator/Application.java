//Application.java
//lab01
//saif youssef
//jul ,4
package com.saifyoussef.calculator;
import java.util.Scanner;




public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (args.length > 0) {
			
		} else {
			
			while (true) {
			System.out.println("Enter operation (ex: addition, subtraction, multiplication, division, factorial, power, sqrt, log, log10, sin, cos, tan,permutation, permutationwithoutrecursion):");
			String operation = scanner.next();
			if ( operation . equalsIgnoreCase (" exit ") ) {
				System . out . println (" Exiting calculator ...") ;
				break;
			}
			// displays options to user and collects input
			double number14 = 0;
			double a = 0;
			double b = 0;	
			double radians = 0;
			
			switch (operation.toLowerCase()) {
			case "power":
				System.out.println("Enter the first operand:");
				 a = scanner.nextDouble();
				System.out.println("Enter the second operand:");
				 b = scanner.nextDouble();
				 System.out.println("Result: " + power(a , b));
					break;
					//performs power function
			case "sqrt":
				System.out.println("Enter a number:");
				double number1 =  scanner.nextDouble();
				System.out.println("Result: " + sqrt(number1));
				break;
			case "log":
				System.out.println("Enter a number:");
				double number2 = scanner.nextDouble();
				System.out.println("Result: " + log(number2));
				break;	
			case "log10":
				System.out.println("Enter a number:");
				double number3 = scanner.nextDouble();
				System.out.println("Result: " + log10(number3));
				break;	
			case "sin":
				System.out.println("Enter a number:");
				double number4 = scanner.nextDouble();
				double radians1 = Math.toRadians(number4);
				System.out.println("Result: " + Math.sin(radians1));
				break;
			case "cos":
				System.out.println("Enter a number:");
				double number5 =  scanner.nextDouble();
				double radians2 = Math.toRadians(number5);
				System.out.println("Result: " + Math.cos(radians2));
				break;
			case "tan":
				System.out.println("Enter a number:");
				double number6 =  scanner.nextDouble();
				double radians3 = Math.toRadians(number6);
				System.out.println("Result: " + Math.tan(radians3));
				break;	
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
				int number = (int) scanner.nextDouble();
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
					System.out.println("enter a nonzero digit");
					
					
				}
				
				break;
				// performs division operation
			case "permutation":
				System.out.println("Enter the total number of elements in the array:");
				a = scanner.nextDouble();
				System.out.println("Enter the number of items to be selected:");
				b = scanner.nextDouble();
				System.out.println("Result: " + permutation(a , b));
				break;
			case "permutationwithoutrecursion":
				System.out.println("Enter the total number of elements in the array:");
				a = scanner.nextDouble();
				System.out.println("Enter the number of items to be selected:");
				b = scanner.nextDouble();
				System.out.println("Result: " + permutationwithoutrecursion(a , b));
				break;
				
			}
		}
	}
		scanner.close();
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
	
	public static long factorial(int num) {
		if (num < 0) {
			System.out.println("Factorial of negative number is undefined:");
			return 0;
		}  
		return factorialHelper(num , num);
	}
	private static long factorialHelper(int originalNum, int num) {
		
		int progress = (int) (((originalNum - num + 1) / (double) originalNum) * 100);
		System.out.print("\rCalculating factorial: " + progress + "%");
		if (num <= 1) {
			return 1;
		}
		return num * factorialHelper(originalNum, num - 1);		
	}
	
	// Exponentiation
	public static double power ( double base , double exponent ) {
		return Math . pow ( base , exponent ) ;
	}
	// Square root
	public static double sqrt ( double number ) {
		return Math . sqrt ( number ) ;
	}
	
	// Natural logarithm
	public static double log ( double number ) {
		return Math . log ( number ) ;
	}
	
	// Base -10 logarithm
	public static double log10 ( double number ) {
		return Math . log10 ( number ) ;
	}
	
	// Sine function
	public static double sin ( double angleRadians ) {
		return Math . sin ( angleRadians ) ;
	}
	
	// Cosine function
	public static double cos ( double angleRadians ) {
		return Math . cos ( angleRadians ) ;
	}
	
	// Tangent function
	public static double tan ( double angleRadians ) {
		return Math . tan ( angleRadians ) ;
	}
	
	public static double permutation(double a, double b){
		if ( a < 0 ) {
			System.out.print("ensure the total number of elements is not less than 0");
			return 0;
		}
		if (b > a) {
			System.out.print("ensure that the number of selected items does not exceed the total number of elements in the\n"
					+ "array.");
			return 0;
		}
		if (b == 0) {
			return 1;
		}
		return a * permutation(a - 1, b - 1);
	}
	public static double permutationwithoutrecursion(double a, double b){
		if ( a < 0) {
			System.out.println("ensure the total number of elements is not less than 0");
		}
		if (b > a) {
			System.out.println("ensure that the number of selected items does not exceed the total number of elements in the\n"
					+ "array.");
	}
		if (b == 0) {
			return 1;
		}
		double permutationwithoutrecursion = 1;
		for (double i = 0; i < b ; i++){
			permutationwithoutrecursion *= (a - 1);
		}
		return permutationwithoutrecursion;
		}}
// defines methods
	

	