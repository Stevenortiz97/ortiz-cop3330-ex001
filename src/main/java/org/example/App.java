/*
*  UCF COP3330 Summer 2021 Assignment 1
*  Copyright 2021 Steven Ortiz
*/

//What is your name? Brian
//Hello, Brian, nice to meet you!

package org.example;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

      private static void output(String outputString) {

        System.out.println(outputString);
    }

    private static String name(){

        System.out.print("What is your name? ");
        return in.nextLine();
    }

    private static String generateoutputString(String name){

        return "Hello, " +name+ ", nice to meet you!";
      }

    public static void main(String[] args){

        String name = name();
        String outputString = generateoutputString(name);
        output(outputString);
    }

}