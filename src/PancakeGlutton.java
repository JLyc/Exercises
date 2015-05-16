/**
 * Created by Iceblaze on 15. 5. 2015.
 */

/*Write a program that asks the user to enter the number of pancakes eaten for breakfast by 10 different people (Person 1, Person 2, ..., Person 10)
        Once the data has been entered the program must analyze the data and output which person ate the most pancakes for breakfast.

        * Modify the program so that it also outputs which person ate the least number of pancakes for breakfast.

        **** Modify the program so that it outputs a list in order of number of pancakes eaten of all 10 people.
        i.e.
        Person 4: ate 10 pancakes
        Person 3: ate 7 pancakes
        Person 8: ate 4 pancakes
        ...
        Person 5: ate 0 pancakes
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.StringBuilder;

public class PancakeGlutton {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int[][] people = new int[10][2];
        StringBuilder ateMost = new StringBuilder();
        StringBuilder ateLeast = new StringBuilder();

        for(int i = 0;i < 10;i++){
            System.out.println("How many pancakes did Person " + (i + 1) + " eat?");
            people[i][0] = (i + 1); //people index
            people[i][1] = getEatenPancakes(); //pancake index
        }


//        if(people[i][1] >= 0){
//                i++;
//            }
//            else{
//                System.out.println("Invalid number. Try again.");
//            }
        //sorts the array based on pancake index
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        //builds a string in case more people ate the same number of pancakes
        ateMost.append(people[9][0]);
        for(int i = 9; people[i][1] == people[i - 1][1]; i--){
            ateMost.insert(0, ", ").insert(0, people[i - 1][0]);
        }

        System.out.println("Person " + ateMost + " ate the most pancakes for breakfast.");


        /*
        //builds a string in case more people ate the same number of pancakes
        ateMost.append(people[9][0]);
        for(int i = 9; people[i][1] == people[i - 1][1]; i--){
            ateMost.insert(0, ", ").insert(0, people[i - 1][0]);
        }
        ateLeast.append(people[0][0]);
        for(int i = 0; people[i][1] == people[i + 1][1]; i++){
            ateLeast.append(", ").append(people[i + 1][0]);
        }

        System.out.println("Person " + ateMost + " ate the most pancakes for breakfast. \n Person " + ateLeast + " ate the least pancakes for breakfast.");
        */

        for(int i = 9; i >= 0; i--){
            if(people[i][1] == 1){
                System.out.println("Person " + people[i][0] + ": ate " + people[i][1] + " pancake");
            }
            else System.out.println("Person " + people[i][0] + ": ate " + people[i][1] + " pancakes");
        }
    }

    private static int getEatenPancakes() {
        int eatenPancake;
        while(true){
            if(eatenPancake = scan.nextInt() > 0){
                return eatenPancake ;
            }
            else{
                System.out.println("Invalid number. Try again.");
            }
        }
    }


}
