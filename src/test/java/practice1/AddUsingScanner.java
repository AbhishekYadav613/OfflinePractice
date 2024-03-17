package practice1;

import java.util.Scanner;

//sum of two numbers using method and input by the user.
public class AddUsingScanner {
    public static void main(String[] args) {
        AddUsingScanner tr = new AddUsingScanner();
        tr.add();

    }

    public void add() {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        sum = a + b;
        System.out.println("Total sum is: " + sum);

    }
}


