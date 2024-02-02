// Programmers:  Josue and Maria
// Course:  CS 212
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement: Output 10 powerball tickets
// Data In: Name
// Data Out: tickets, message, prize
// Credits: Stackoverflow.com, Class Notes #3

//Imports
import java.sql.Array;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    
    public static void main(String[] args) {
        
        //Initialize prize variable
        //long prize = 225938745L;

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Create Random object
        Random rand = new Random();

        //Create DecimalFormatObject
        DecimalFormat num = new DecimalFormat("$,###");
    
        // Print purpose of program
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //Initialize winning numbers
        int [] winningNumber= {3,5,16,58,11};

        //Ask user for name
        System.out.print("What's your name? ");
        //Store name to variable
        String customerName = input.nextLine();
        //Strip name and cut off after first name
        customerName = customerName.replaceAll("\\s.*","");

        //Ask user for how much they want to play
        System.out.println("How much do you want to play? ");
        double bet = input.nextDouble();
        System.out.println("Great! " + customerName + " wants to play" + num.format(bet));

        //Initialize int counter i
        int i = 0;

        //Print ticket heading
        System.out.println("Here are the tickets:");
        System.out.println("------------------");

        //Loop until i = 10
        while (i < 10) {
            //Initialize int counter j
            int j = 0;
            //Loop until j = 6
            while (j < 6) {
                // generate a number
                int number = rand.nextInt(99) + 0;

                //Check number against winning numbers
                int x;

                //Iterate through winningNumbers
                for (int m = 0; m < winningNumber.length; m ++){
                    x = winningNumber[m];

                    //check if the number generated is a winning number
                    if (number == x){
                        //if the generated number is a winning number raise the bet to the power of 1.75
                        bet = Math.pow(bet,1.75);
                    }
                }
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
            //Increment counter i
            i++;

        }
        //Output ticket footer
        System.out.println("------------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Your winnings are:");
        System.out.println(num.format(bet));
        System.out.println("------------------");

    }
}
