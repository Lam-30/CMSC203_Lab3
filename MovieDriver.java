package Lab1;

import java.util.Scanner;

public class MovieDriver 
{

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		String answer;
	
	
	do {
		//New Movie object
		Movie movie = new Movie();
		
		//Ask for movie title
		System.out.println("Enter the movie title: ");
		String title = keyboard.nextLine();
		movie.setTitle(title);
		
		//Ask for movie rating
		System.out.println("Enter the movie rating: ");
		String rating = keyboard.nextLine();
		movie.setRating(rating);
		
		//Ask for tickets sold
		System.out.println("Enter the number of tickets sold:");
		int soldTickets = keyboard.nextInt();
		movie.setSoldTickets(soldTickets);
		
		//Clear the leftover newline
		keyboard.nextLine();
		
		//Display movie information
		System.out.println(movie.toString());
		
		//Ask whether the user wants to continue
		System.out.println("Do you want to enter another movie? (yes/no");
		
		answer = keyboard.nextLine();
		
	} while (answer.equalsIgnoreCase("yes"));
	
	System.out.println("Goodbye!");
	
	keyboard.close();
	}

}
