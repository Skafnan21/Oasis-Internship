// Java Program to guess a Random Number Generation
package com.company;
import java.util.*;
public class GuessingNo {
    public static void main(String[]args)
        {
            int answer, guess,count=0;

            final int MAX = 100;
            Scanner in = new Scanner(System.in);

            Random r = new Random();
            boolean correct = false;

            answer = r.nextInt(MAX) ;
            while (!correct) {

                System.out.println(" Guess a number between 1 and 100: ");
                guess = in.nextInt();
                if (guess > answer) {
                    System.out.println("Number is too high, try again");
                    count++;
                }

                // if guess is less than actual
                else if (guess < answer) {
                    System.out.println("Number is too low, try again");
                    count++;
                }

                // guess is equal to actual value
                else {

                    System.out.println("Yes, you guessed the number.");
                    System.out.println("Actual Number is  = "+ answer);
                    System.out.println("You Succesfull after   = "+ count+" Times ");
                    correct = true;
                }
            }
            System.exit(0);
        }
    }


