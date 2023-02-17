/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (A game for the user to guess the randomly generated number)
 * Due: 2/23/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Dagmawi Delelegne
*/

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\t\t\t\tRandom Number Guesser\n");
		// create booleans to be used for user input validation 
		boolean repeat = true;
		while(repeat) {
		Random rand = new Random();
		int randNum = rand.nextInt(100);
		
		System.out.println("You have to enter a guess from 0 to a 100 ");
		System.out.println("Enter your first guess");
		Scanner sc = new Scanner(System.in);
		
		boolean repeat2 = true;
		
		int lowGuess = 0;
		int highGuess = 100;
		//create holders for the limit the numbers that can be inputed
	for(int counter = 1; repeat2 ; counter++) {
		// a for loop to count the number of times the user guesses
		int	guess = sc.nextInt();
		
		if(guess == randNum) {
			System.out.println("Yay! you guessed the correct number.");
			System.out.printf("You have guessed %d times\n", counter);
			System.out.println("Do you want to try again?(yes or no)");
			
			String tryAgain = sc.next();
			
			if(tryAgain.equals("yes")) {
				// if the user guesses the correct number and wants to play again
				// the boolean for the while loop is set to true and the one for the for
				//loop is set to false so that the program can start again
				repeat = true;	
				repeat2 = false;		
			}
			else if(tryAgain.equals("no")) {	
				System.out.println("Thanks for playing.");
				System.out.print("Programmer : Dagmawi Delelegne\n" + "Instructor: Ahmed Tarek\n" + "Submission date: 2/21/2023\n");
				repeat = false;
				repeat2 = false;
			}
		}
		// this is so that the value of highGuess is not reset back
		// to a more distant value than was guessed
		if(guess > randNum && highGuess > guess) {
			highGuess = guess;
			
		}
		// this is so that the value of high guess is not going to correlate
		// with lowGuess
		else if(highGuess < guess && guess > randNum) {
			while(highGuess < guess) {
				System.out.printf("  >> your guess should only be between %d and %d \n", lowGuess,highGuess);
				guess = sc.nextInt();
				
			}
			if(guess > randNum)
			highGuess = guess;
		}
		else;
		// the same is done for lowGuess as done for highGuess
		if(guess < randNum && lowGuess < guess) {
			lowGuess = guess;
		}	
		else if (lowGuess > guess && guess < randNum){
			while(lowGuess > guess) {
				System.out.printf("  >> your guess should only be between %d and %d \n", lowGuess,highGuess);
				guess = sc.nextInt();
				
			}
			if(guess < randNum)
			lowGuess = guess;
		}
		
		
		else;
		// this is to prompt the user when the value guessed is close the actual randomNumber
		 if(guess >= randNum + 7){
			
			System.out.println("your guess is too high");
			System.out.printf("Enter your next guess between %d and %d \n",lowGuess,highGuess);
			System.out.printf("You have guessed %2d times\n", counter);
			
		}
		else if(guess <= randNum - 7) {
			
			System.out.println("your guess is too low");
			System.out.printf("Enter your next guess between %d and %d \n ",lowGuess,highGuess);
			System.out.printf("You have guessed %2d times\n", counter);
		}
		else if(guess < randNum + 7 && guess > randNum ) {
			
			System.out.println("you are getting close guess lower");
			System.out.printf("Enter your next guess between %d and %d \n",lowGuess,highGuess);
			System.out.printf("You have guessed %2d times\n", counter);
			
		}
		else if(guess > randNum - 7 && guess < randNum) {
			
			System.out.println("you are getting close guess higher");
			System.out.printf("Enter your next guess between %d and %d \n",lowGuess,highGuess);
			System.out.printf("You have guessed %2d times\n", counter);
			
		}
		else;
		
	}
	}
		
	}
}
