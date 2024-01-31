// Programmers:  Josue and Maria
// Course:  CS 212
// Due Date: 2/4/24
// Lab Assignment: 2
// Problem Statement: Output 10 powerball tickets
// Data In: Name
// Data Out: tickets, message, prize
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person


import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat num = new DecimalFormat("$,###");

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        System.out.print("What's your name? ");

        String customerName = input.nextLine();
        customerName = customerName.replaceAll("\\s.*","");
        int i = 0;
        System.out.println("Here is the ticket:");
        while (i < 10) {
            int j = 0;
            while (j < 6) {
                int number = rand.nextInt(99) + 0;
                if (number < 10) {
                    String num_str = "0" + number;
                    System.out.print(num_str + " ");
                    j++;
                } else {
                    System.out.print(number + " ");
                    j++;

                }

            }
            System.out.println();
            i++;

        }
        System.out.println("------------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:");
        System.out.println(num.format(prize));
        System.out.println("------------------");

    }
}
