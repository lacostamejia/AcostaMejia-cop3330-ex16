/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 * What is your age? 15
You are not old enough to legally drive.
*
* What is your age? 35
You are old enough to legally drive.
 */

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method declared

        //These are variables that are going to be using
        int age;

        System.out.print("What is your age? ");
        age = in.nextInt();

        if(age >= 16)
        {
            System.out.println("You're old enough to legally drive.");
        }
        else{
            System.out.println("You're not old enough to legally drive.");
        }



    }
}
