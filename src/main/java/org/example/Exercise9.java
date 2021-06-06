/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 9 - Paint calculator

package org.example;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        //Get length and width of ceiling of room to cover from user
        Scanner getMeasurements = new Scanner(System.in);
        System.out.print("What is the length of the ceiling of the room in feet? ");
        String length = getMeasurements.nextLine();
        Integer ceiling_length=Integer.parseInt(length);

        System.out.print("What is the width of the ceiling of the room in feet? ");
        String width = getMeasurements.nextLine();
        Integer ceiling_width=Integer.parseInt(width);

        //conversions
        int total_area = ceiling_length*ceiling_width;
        int gallons_needed = (int) Math.ceil(total_area / 350.0);
        System.out.println("You will need to purchase " +gallons_needed+ " gallons of paint to cover " +total_area+
                " square feet.");

    }
}
