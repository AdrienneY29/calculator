package com.tts;

import java.util.Scanner;

// Part 2
//        Create a MagicCalculator that inherits its basic functionality from your calculator and does the following functions:
//        Finds the square root of a number
//        Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
//        Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
//        Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
//        Finds the factorial (!) of the number
//        Submit a link to your GitHub repository

public class MagicCalculator extends Calculator {

    private double num1;
    private double num2;


    public MagicCalculator(int num1, int num2, double num11, double num21) {
        super(num1, num2);
        this.num1 = num11;
        this.num2 = num21;
    }


    public static void squareRoot (double num11)
    {
        System.out.println("The square root is" + (Math.sqrt(num11)));

    }

    public static void sine(double num11)
    {
        //convert num1 values to radians
        double num21= Math.toRadians(num11);
        System.out.println("The sine is " + Math.sin(num21));
    }

    public static void cosine(double num11)
    {
        //convert num1 values to radians
        double num21 = Math.toRadians(num11);
        System.out.println("The cosine is " + Math.cos(num21));
    }

    public static void tangent(double num11)
    {
        //convert num1 values to radians
        double num21 = Math.toRadians(num11);
        System.out.println("The tangent is " + Math.tan(num21));
    }
    public static void factorial(double num11)
    {
//        (int) num11 = double num11;
//        (int) num21 = double num21;
        //factorial
            int i;
            long factorial = 1;
         for (i=1; i<= num11; i++) {
            factorial *= i;         }
            System.out.println("The factorial is " + factorial);


    }


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        double num11 = scanner.nextDouble();
        scanner.nextLine();

        MagicCalculator.squareRoot(num11);
        MagicCalculator.sine(num11);
        MagicCalculator.cosine(num11);
        MagicCalculator.tangent(num11);
        MagicCalculator.factorial(num11);


    }

}