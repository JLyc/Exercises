/**
 * Created by Iceblaze on 15. 5. 2015.
 */

/*
Write a program that allows the user to enter the grade scored in a programming class (0-100).
If the user scored a 100 then notify the user that they got a perfect score.

* Modify the program so that if the user scored a 90-100 it informs the user that they scored an A

** Modify the program so that it will notify the user of their letter grade
0-59 F 60-69 D 70-79 C 80-89 B 90-100 A
 */

import java.util.Scanner;

public class GradingProgram {

    public static void main(String[] args){

        System.out.print("Enter your grade: ");

        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        /*if(grade == 100){
            System.out.println("You got a perfect score!");
        }
        */

        /*if(grade >= 90 && grade <= 100){
            if(grade == 100){
                System.out.println("You got a perfect score!");
            }
            System.out.println("You got an A.");
            }
        */
        if(grade == 100){
            System.out.println("You got a perfect score!");
        }
        else if(grade >= 90){
            System.out.println("You got an A.");
        }
        else if(grade >= 80){
            System.out.println("You got a B.");
        }
        else if(grade >= 70){
            System.out.println("You got a C.");
        }
        else if(grade >= 60){
            System.out.println("You got a D.");
        }
        else if(grade <= 59){
            System.out.println("You got an F.");
        }
        else{
            System.out.println("Invalid grade.");
        }
    }
}