/**
 * Created by Iceblaze on 16. 5. 2015.
 */

/*
Write a program that calculates a random number 1 through 100. The program then asks the user to guess the number.
If the user guesses too high or too low then the program should output "too high" or "too low" accordingly.
The program must let the user continue to guess until the user correctly guesses the number.

* Modify the program to output how many guesses it took the user to correctly guess the right number.

** Modify the program so that instead of the user guessing a number the computer came up with, the computer guesses the number that the user has secretly decided. The user must tell the computer whether it guessed too high or too low.

**** Modify the program so that no matter what number the user thinks of (1-100) the computer can guess it in 7 or less guesses.
*/

import java.util.Scanner;
import java.util.Random;

public class BracketingSearch {

    public static void main(String[] args){

        Random randomGen = new Random();
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        int randomNumber = randomGen.nextInt(100) + 1;
        int guess;
        int counter = 0;
        int maxGuess = 100;
        int minGuess = 1;
        String hint;

        /*do {
            System.out.println("Guess a number between 1 and 100.");
            guess = scanInt.nextInt();
            if(guess > randomNumber) System.out.println("too high");
            if(guess < randomNumber) System.out.println("too low");
        } while(guess != randomNumber);

        System.out.println("You guessed correctly!");
        */

        /*do {
            System.out.println("Guess a number between 1 and 100.");
            guess = scanInt.nextInt();
            counter++;
            if(guess > randomNumber) System.out.println("too high");
            if(guess < randomNumber) System.out.println("too low");
        } while(guess != randomNumber);

        if(counter == 1) System.out.println("You guessed correctly in " + counter + " guess.");
        else System.out.println("You guessed correctly in " + counter + " guesses.");
        */

        do {
            guess = randomGen.nextInt(maxGuess - minGuess + 1) + minGuess;
            System.out.println("Is number " + guess + " \"too low\", \"too high\" or \"correct\"?");
            hint = scanString.nextLine();

            if(hint.equals("too low")) minGuess = guess + 1;
            else if(hint.equals("too high")) maxGuess = guess - 1;
            else if(hint.equals("correct")) break;
            else System.out.println("Invalid input entered.");
        } while(true);
    }
}
