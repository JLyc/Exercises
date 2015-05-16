/**
 * Created by Iceblaze on 15. 5. 2015.
 */

/*
Write a program that presents the user w/ a choice of your 5 favorite beverages (Coke, Water, Sprite, ... , Whatever).
Then allow the user to choose a beverage by entering a number 1-5.
Output which beverage they chose.

* If you program uses if statements instead of a switch statement, modify it to use a switch statement.
If instead your program uses a switch statement, modify it to use if/else-if statements.

** Modify the program so that if the user enters a choice other than 1-5 then it will output "Error. choice was not valid, here is your money back."
*/

import java.util.Scanner;

public class ColaMachine {

    public static void main(String[] args){

        System.out.println("Choose a beverage: 1-Coke, 2-Water, 3-Sprite, 4-Fanta, 5-Nestea");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        /*if(choice == 1){
            System.out.println("You chose Coke.");
        }
        else if(choice == 2){
            System.out.println("You chose Water.");
        }
        else if(choice == 3){
            System.out.println("You chose Sprite.");
        }
        else if(choice == 4){
            System.out.println("You chose Fanta.");
        }
        else if(choice == 5){
            System.out.println("You chose Nestea.");
        }
        */

        /*switch(choice){
            case 1: System.out.println("You chose Coke.");
                    break;
            case 2: System.out.println("You chose Water.");
                    break;
            case 3: System.out.println("You chose Sprite.");
                    break;
            case 4: System.out.println("You chose Fanta.");
                    break;
            case 5: System.out.println("You chose Nestea.");
                    break;
        }
        */
        switch(choice){
            case 1: System.out.println("You chose Coke.");
                    break;
            case 2: System.out.println("You chose Water.");
                    break;
            case 3: System.out.println("You chose Sprite.");
                    break;
            case 4: System.out.println("You chose Fanta.");
                    break;
            case 5: System.out.println("You chose Nestea.");
                    break;
            default: System.out.println("Error. choice was not valid, here is your money back.");
                    break;
        }

    }
}
