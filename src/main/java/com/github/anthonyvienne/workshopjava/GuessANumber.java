package com.github.anthonyvienne.workshopjava;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {


    public static void main(String[] args) {
        int count = 0;
        int val = 0;
        int min = (args.length == 2 ? Integer.parseInt(args[0]) : 1);
        int max = (args.length == 2 ? Integer.parseInt(args[1]) : 100);
        Random rand = new Random();
        int searchedValue = rand.nextInt(max - min + 1) + min;

        Scanner scan = new Scanner(System.in);
        for (; true; count++) {
            System.out.println("Your guess? ");
            val = scan.nextInt();
            if (val > searchedValue)
                System.out.println("Too high!");
            else if (val < searchedValue)
                System.out.println("Too low!");
            else {
                System.out.println("You win!");
                break;
            }
        }
        System.out.println("It took you " + count + " tries.");
    }

}
