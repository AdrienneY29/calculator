package com.tts;
import java.util.*;

//    Create a Java Calculator Class that does the following five commands:
//        An add method that takes in two integer numbers and adds them together the call to that method would look like this: add(int num1, int num2)
//        A subtraction method that takes in two integers and subtracts them from one another would look like this: subtract( int num1, int num2)
//        A multiplication method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
//        A division method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
//        A square method that takes in one integer and squares it: square(int num1, int num2)

public class Calculator{
    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

////////////
    public static void add(int num1, int num2)
    {
        System.out.println("The sum is: " +  (num1 + num2));
    }

    public static void subtract(int num1, int num2)
    {
        System.out.println("The subtraction result is " + (num1 - num2));
    }
    public static void multiplication (int num1, int num2)
    {
      System.out.println("The multiplication result is " + (num1 * num2));
    }

    public static void division( int num1, int num2)
    {
        System.out.println("The division result is " + ( num1 / num2));
    }

    public static void square (int num1, int num2)
    {
        System.out.println("The square for the first number is " + (num1 *= num1));
        System.out.println("The square for the second number is " + (num2 *= num2));
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter another integer");
        int num2 = scanner.nextInt();

        Calculator.add(num1, num2);
        Calculator.subtract(num1,num2);
        Calculator.multiplication(num1,num2);
        Calculator.division(num1, num2);
        Calculator.square(num1, num2);
    }
}

