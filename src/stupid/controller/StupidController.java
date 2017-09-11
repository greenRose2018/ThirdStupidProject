package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	public void start()
	{
		System.out.println("My name is Brittney, I like the color green.");
		System.out.println("I love to read books.");
		
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
	}

}
