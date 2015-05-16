/**
 * Created by Iceblaze on 15. 5. 2015.
 */

/*
Write a program that continues to asks the user to enter any number other than 5 until the user enters the number 5.
Then tell the user "Hey! you weren't supposed to enter 5!" and exit the program.

* Modify the program so that after 10 iterations if the user still hasn't entered 5 will tell the user "Wow, you're more patient then I am, you win." and exit.

** Modify the program so that it asks the user to enter any number other than the number equal to the number of times they've been asked to enter a number. (i.e on the first iteration "Please enter any number other than 0" and on the second iteration "Please enter any number other than 1"m etc. etc. The program must behave accordingly exiting when the user enters the number they were asked not to.)

*/

import java.util.Scanner;

public class Gullible {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        boolean notNumber = true;
        int choice;
        int counter = 0;

        /*while(notNumber){
            System.out.println("Enter any number other than 5.");
            choice = scan.nextInt();
            if(choice == 5){
                System.out.println("Hey! you weren't supposed to enter 5!");
                notNumber = false;
            }
        }
        */

        /*for(int i = 0; i < 10 && notNumber; i++){
            System.out.println("Enter any number other than 5.");
            choice = scan.nextInt();
            if (choice == 5){
                System.out.println("Hey! you weren't supposed to enter 5!");
                notNumber = false;
            }
        }
        if(notNumber == true){
            System.out.println("Wow, you're more patient then I am, you win.");
        }
        */

        while(notNumber){
            System.out.println("Enter any number other than " + counter + ".");
            choice = scan.nextInt();
            if(choice == counter){
                System.out.println("Hey! you weren't supposed to enter " + counter + "!");
                notNumber = false;
            }
            counter++;
        }
    }
}
