import java.util.Scanner;

public class shadyRestRoom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Precious Sani
		 * Date: 09/12/2023
		 * Lab 3
		 * Question 2B
		 */
		
		//declare variables
		double priceQ = 125; // room prices
		double priceK = 139;
		double priceKS = 165;
		double price = 0;
		
		int selected = 0;	//User selection
		int viewSelect = 0;
		Scanner keyboard = new Scanner(System.in); 
		
		//Prompt User for input and welcome message
		System.out.println("Welcome to Shady Rest Room Reservation");
		
		System.out.println(" Enter 1 for Queen Bed\n"
		+ " Enter 2 for King Bed\n" + " Enter 3 for King and a Suite");
		selected = keyboard.nextInt(); //Capture user input
		keyboard.nextLine(); //Clear buffer
		
		if (selected == 1)
		{
			price = priceQ;
			System.out.println(" You selected the Queen Bed and the room price is $"
					+ String.format("%.2f", price));
			
			System.out.println(" Enter 1 for Lake View\n" + " Enter 2 for Park View");
			viewSelect = keyboard.nextInt(); //Capture user input
			keyboard.nextLine(); //Clear buffer
			
			if (viewSelect == 1 )
			{
				price = priceQ + 15;
				System.out.println(" You selected the Queen Bed and lake view, the room price is $"
						+ String.format("%.2f", price));
			}
			
			else if (viewSelect == 2 )
			{
				System.out.println(" You selected the Queen Bed and Park view, the room price is $"
						+ String.format("%.2f", price));
			}
			
			else
				
			{
				System.out.println(" View selection is invalid");
				price = priceQ + 15;
				System.out.println(" You selected the Queen Bed and lake view added by default, the room price is $"
						+ String.format("%.2f", price));
			}
			
			
		}
		
		else if (selected == 2)
		{
			price = priceK;
			System.out.println(" You selected the King Bed and the room price is $"
					+ String.format("%.2f", price));
			//***************************************
			System.out.println(" Enter 1 for Lake View\n" + " Enter 2 for Park View");
			viewSelect = keyboard.nextInt(); //Capture user input
			keyboard.nextLine(); //Clear buffer
			
			if (viewSelect == 1 )
			{
				price = priceK + 15;
				System.out.println(" You selected the King Bed and lake view, the room price is $"
						+ String.format("%.2f", price));
			}
			
			else if (viewSelect == 2 )
			{
				System.out.println(" You selected the King Bed and Park view, the room price is $"
						+ String.format("%.2f", price));
			}
			
			else
				
			{
				System.out.println(" View selection is invalid");
				price = priceK + 15;
				System.out.println(" You selected the King Bed and lake view added by default, the room price is $"
						+ String.format("%.2f", price));
			}
		}
		
		else if (selected == 3)
		{
			price = priceKS;
			System.out.println(" You selected the King and Suite and the room price is $"
					+ String.format("%.2f", price));
			
			System.out.println(" Enter 1 for Lake View\n" + " Enter 2 for Park View");
			viewSelect = keyboard.nextInt(); //Capture user input
			keyboard.nextLine(); //Clear buffer
			
			if (viewSelect == 1 )
			{
				price = priceKS + 15;
				System.out.println(" You selected the King bed suite and lake view, the room price is $"
						+ String.format("%.2f", price));
			}
			
			else if (viewSelect == 2 )
			{
				System.out.println(" You selected the King bed suite and Park view, the room price is $"
						+ String.format("%.2f", price));
			}
			
			else
				
			{
				System.out.println(" View selection is invalid");
				price = priceKS + 15;
				System.out.println(" You selected the King bed suite and lake view added by default, the room price is $"
						+ String.format("%.2f", price));
			}
		}
		
		else
		{
			price = 0;
			System.out.println(" You selection is invalid\n" + "price = $" + String.format("%.2f", price));
			
		}
		

		
		
		
	}

}
