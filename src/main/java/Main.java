/*
* UCF COP 3330 Fall 2021 Assignment 22 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x1 = num.nextInt();
        System.out.println("Enter the second number: ");
        int x2 = num.nextInt();
        System.out.println("Enter the third number: ");
        int x3 = num.nextInt();

        int y;

        if(x1==x2 || x2==x3 || x1==x3)
            System.exit(0);

        if((x1>x2) && (x1>x3))
            y=x1;

        else if((x2>x1) && (x2>x3))
            y=x2;

        else
            y=x3;


        System.out.printf("The largest number is %d", y);

    }
}