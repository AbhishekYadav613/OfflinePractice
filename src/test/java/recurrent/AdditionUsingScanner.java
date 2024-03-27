package recurrent;

import practice1.AddUsingScanner;

import java.util.Scanner;

// adding two numbers as per user's input.
public class AdditionUsingScanner {
    public static void main(String[] args) {
        AdditionUsingScanner tm = new AdditionUsingScanner();
        tm.addition();

    }

    public void addition ()
    {

        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Required output is: " +sum);

    }
}
