// Programmers:  Josue and Maria
// Course:  CS 212
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement: Output 10 powerball tickets
// Data In: Name
// Data Out: tickets, message, prize
// Credits: Stackoverflow.com, Class Notes #3

//Imports
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    
    public static void main(String[] args) {
        
        //Initialize prize variable
        long prize = 225938745L;

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Create Random object
        Random rand = new Random();

        //Create DecimalFormatObject
        DecimalFormat num = new DecimalFormat("$,###");
    
        // Print purpose of program
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //Ask user for name
        System.out.print("What's your name? ");
        //Store name to variable
        String customerName = input.nextLine();
        //Strip name and cut off after first name
        customerName = customerName.replaceAll("\\s.*","");

        //Initialize int counter i
        int i = 0;

        //Print ticket heading
        System.out.println("Here is the ticket:");

        //Loop until i = 10
        while (i < 10) {
            //Initialize int counter j
            int j = 0;
            //Loop until j = 6
            while (j < 6) {
                // generate a number
                int number = rand.nextInt(99) + 0;
                if (number < 10) {
                    //format numbers that are less than 10
                    String num_str = "0" + number;
                    System.out.print(num_str + " ");
                    //Increment counter j
                    j++;
                } else {
                    //Output numbers from 10-99
                    System.out.print(number + " ");
                    //Increment counter j
                    j++;

                }

            }
            //Create a newline for the next ticket
            System.out.println();
            //Incrememnt counter i
            i++;

        }
        //Output ticket footer
        System.out.println("------------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:");
        System.out.println(num.format(prize));
        System.out.println("------------------");

    }
}
