package recurrent;

import java.util.Scanner;

// basic add, sub, mul, div.
public class BasicMaths {
    public static void main(String[] args) {
        BasicMaths rec = new BasicMaths();
        rec.add(3, 5);
        rec.div();
        rec.mul(4, 5);
        rec.sub(62, 10);

    }

    public void add(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public void sub(int a, int b) {
        int diff = 0;
        diff = a - b;
        System.out.println("Difference is: " + diff);
    }

    public void mul(int a, int b) {
        int into = 0;
        into = a * b;
        System.out.println("Multiplication is: " + into);
    }

    public void div() {
        System.out.println("Enter the numbers to be divided: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int div = a / b;

        System.out.println("Result after division is:" + div);

    }

}

