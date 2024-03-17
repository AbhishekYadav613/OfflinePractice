package random1;

import java.util.Scanner;

//Dynamic Input to check the weekday.
public class ScannerClassExample2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = scan.nextLine();

        System.out.print("Enter a number between 1 and 7: ");
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println("Your Name is " + name + " and you entered: " + num + " Hence the day is Monday.");
        } else if (num == 2) {
            System.out.println("Your Name is " + name + " and you entered: " + num + " Hence the day is Tuesday.");
        } else if (num == 3) {
            System.out.println("Your Name is " + name + " and you entered: " + num + " Hence the day is Wednesday.");
        } else if (num == 4) {
            System.out.println("Your Name is " + name + " and you entered: " + num + " Hence the day is Thursday.");
        } else if (num == 5) {
            System.out.println("Your Name is " + name + " and you entered: " + num + " Hence the day is Friday.");
        } else if (num == 6 || num == 7) {
            System.out.println("Your Name is " + name + " and you entered: " + num + " Today is weekend.");
        } else {
            System.out.println("You need to enter a correct number.");
        }
    }
}
