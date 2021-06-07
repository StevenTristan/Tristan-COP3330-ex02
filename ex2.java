/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Steven Tristan
 */

import java.util.Scanner;

public class example2
{
    public static void main(){
        ex2();
}
    public static void ex2()
    {
        System.out.println("What is the input string?");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int count = (char)input.length();
        System.out.println(input + " has " + count + " characters");
    }

}