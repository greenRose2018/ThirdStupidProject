package stupid.controller;

import java.util.Scanner;
import stupid.model.PlayDohCircle;
import stupid.model.PlayDohX;

public class StupidController
{
	public void start()
	{
		//
		PlayDohCircle firstCircle = new PlayDohCircle();
		
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		//practice
		PlayDohX firstX = new PlayDohX();
		
		PlayDohX secondX; 
		secondX= new PlayDohX();
		
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my Second circle " + secondCircle);	
		
		System.out.println("Yay " + firstX);
		System.out.println(secondX);
		
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
		System.out.println("How old are you?");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("you said that you are " + ageAnswer + " years old.");
		
		PlayDohCircle changeCircle = new PlayDohCircle();
		System.out.println("Here is the circle befor I change it");
		System.out.println(changeCircle);
		System.out.println("Type in a new size - use numbers please.");
		int mySize = firstScanner.nextInt();
		changeCircle.setSize(mySize);
		System.out.println("now look at the circle");
		System.out.println(changeCircle);
		
	}

}
