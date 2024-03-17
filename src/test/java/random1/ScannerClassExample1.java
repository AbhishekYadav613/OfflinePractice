package random1;

import java.util.Scanner;

//using scanner class to take dynamic inputs from the users.
public class ScannerClassExample1 {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number between 1-7 to check the details: ");
        int day = var.nextInt();

        if (day == 1)
            System.out.println("Today is Monday");
        else if(day == 2)
            System.out.println("Tuesday");
        else
            System.out.println("Try Again");

    }
}
