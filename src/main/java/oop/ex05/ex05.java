/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 05 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex05;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args)
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String userNum1 = userInputScanner.nextLine();
        System.out.print("What is the second number? ");
        String userNum2 = userInputScanner.nextLine();

        int intNum1 = Integer.parseInt(userNum1);
        int intNum2 = Integer.parseInt(userNum2);

        int outputAddition = intNum1 + intNum2;
        int outputSubtraction = intNum1 - intNum2;
        int outputMultiplication = intNum1 * intNum2;
        int outputDivision = intNum1 / intNum2;

        System.out.print(userNum1 + " + " + userNum2 + " = " + outputAddition + "\n"
        + userNum1 + " - " + userNum2 + " = " + outputSubtraction + "\n" + userNum1 + " * " + userNum2
        + " = " + outputMultiplication + "\n" + userNum1 + " / " + userNum2 + " = " + outputDivision);
    }
}
