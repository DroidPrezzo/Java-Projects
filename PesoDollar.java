import java.util.Scanner;

public class PesoDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Precious Sani
		 * Date: 09/12/2023
		 * Lab 3
		 * Question 1
		 */
		
		//declare variables
		double finalAmount = 0;
		double amount = 0;
		double rate = 19.137; //exchange rate
		int selection = 0;	//User selection
		Scanner input = new Scanner(System.in); 
		
		//Prompt User
		System.out.println("Welcome to currency converter");
		System.out.println(" Enter 1 to convert to Do1lars\n"
		+ " Enter 2 to convert to Pesos ");
		selection = input.nextInt(); //Capture user input
		input.nextLine(); //Clear buffer
		
		//Prompt User to enter amount
		System.out.println(" Enter Amount to convert ");
		amount = input.nextDouble(); //get input
		input.nextLine(); //Clear buffer
		
		if(selection == 1)
		{
			System.out.println(" Converting Pesos to Dollars ");
			finalAmount = amount/rate;
			System.out.println(String.format("%.2f", amount) + " Pesos is "
			+ String.format("%.2f", finalAmount) + "Dollars");
		}
		
		else 
		{
			System.out.println(" Converting Dollars to Pesos");
			finalAmount = amount*rate;
			System.out.println(String.format("%.2f", amount) + " Dollars is "
			+ String.format("%.2f", finalAmount) + " Pesos");
		}
		
	}

}
