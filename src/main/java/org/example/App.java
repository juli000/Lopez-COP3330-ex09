/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is the length of the room?" );
        Scanner s = new Scanner(System.in);
        String l = s.nextLine();
        System.out.println("What is the width of the room?");
        String w = s.nextLine();
        Integer length = Integer.valueOf(l);
        Integer width = Integer.valueOf(w);
        Integer a = length * width;


    }
}
