/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // prompt for string
        System.out.print("What is the input string? ");

        // create new scanner
        Scanner input = new Scanner(System.in);

        // read user's response
        String response = input.nextLine();

        // get length of response
        int length = response.length();

        // output response along with its length
        System.out.print(response + " has " + length + " characters.");
    }
}
