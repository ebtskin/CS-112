
//Week 3 Lab 6
//Read 2 numbers and print out sum, difference, product, quotient. 

import java.util.Scanner;

public class Week3Lab6
{

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	int number1;
	int number2;
	int sum;
	int quotient;
	int difference;
	int product;
	
	System.out.print("This program will read, add, minus, times, and divide two numbers automatically.\n");

	System.out.print( "Enter first number: " );
	number1 = input.nextInt();

	System.out.print( "Enter second number: " );
	number2 = input.nextInt();
	
	sum = number1 + number2;
	product = number1 * number2;
	difference = number1 - number2;
	quotient = number1 / number2;
	
	System.out.printf("1. Sum is: %d,%n", sum);
	System.out.printf("2. Difference is: %d,%n", difference);
	System.out.printf("3. Product is: %d,%n", product);
	System.out.printf("4. Quotient is: %d,%n", quotient);
	
	System.out.printf("\nThank You for using our services. Please come again!");

	}


}