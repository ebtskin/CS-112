
//Week 5 HomeWork
//Condition Calculator using if,else if, else statement. 

import java.util.Scanner;

public class ConditionCalculator
{

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	int option;
	int number1;
	int number2;
	int sum;
	int quotient;
	int difference;
	int product;
	
	
	System.out.print("Welcome to Math Calculator. Choose an option!\nAddition = 1, Subtraction = 2, Multiplication = 3, Division = 4 \n");
	
	System.out.print( "Enter number option: " );
	option = input.nextInt();

	if (option == 1)
	
		{	
		System.out.print( "\nYou chosen the Addition Calculator.\n");
		
		System.out.print( "Please enter first number to calculate: " );
		number1 = input.nextInt();
		
		System.out.print( "Please enter second number to calculate: " );
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Answer: %d+%d=%d", number1, number2, sum);

		}

	else if (option == 2)
		{
		
		System.out.print( "\nYou chose the Subtraction Calculator\n" );
		
		System.out.print( "Enter first number: " );
		number1 = input.nextInt();
		
		System.out.print( "Enter second number: " );
		number2 = input.nextInt();
		
		difference = number1 - number2;
		
		System.out.printf("Answer: %d-%d=%d", number1, number2, difference);	
		}
	else if (option == 3)
		{
		
		System.out.print( "\nYou chose the Multiplication Calculator\n" );
		
		System.out.print( "Enter first number: " );
		number1 = input.nextInt();
		
		System.out.print( "Enter second number: " );
		number2 = input.nextInt();	
		
		product = number1 * number2;
		
		System.out.printf("Answer: %dX%d=%d", number1, number2, product);	
		}
	else if (option ==4 )
		{
		
		System.out.print( "\nYou chose the Division Calculator\n" );
		
		System.out.print( "Enter first number: " );
		number1 = input.nextInt();
		
		System.out.print( "Enter second number: " );
		number2 = input.nextInt();	
		
		quotient = number1 / number2;
		
		System.out.printf("Answer: %d/%d=%d", number1, number2, quotient);
		}
	
	System.out.print("\n\nThank You for using Math Calculator!");
	
	}


}
// Good ...now try to use +,-,*,/ instead of 1,2,3,4 
// and please put your name on the code, as your repository does not identify you
