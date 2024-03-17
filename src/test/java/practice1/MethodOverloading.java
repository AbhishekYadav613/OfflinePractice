package practice1;

import java.util.Scanner;

//Method overloading for number addition.
public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading tr = new MethodOverloading();
        tr.addNumber(3, 7);

    }

    public void addNumber(int a, int b)

    {
        int sum;

        System.out.println("Enter first number: ");
        Scanner sc= new Scanner(System.in);
       a=  sc.nextInt();

        System.out.println("Enter second number: ");
        b= sc.nextInt();

        sum=a+b;

        System.out.println("First method and the sum is: "+ sum);
    }

    public void addNumber(int b, int c, int d)
    {
        System.out.println("This is the second method.");
    }
}
