package recurrent;

import java.util.Scanner;

// take user input and tell the day using else/else if loop.
public class WeekdayOnInput {
    public static void main(String[] args) {
        WeekdayOnInput wd = new WeekdayOnInput();
        wd.week();

    }

    public void week() {
        System.out.println("Enter the number you want: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println("Monday.");
        } else if (num == 2) {
            System.out.println("Tuesday.");

        } else if (num == 3) {

            System.out.println("Wed.");
        } else if (num == 4) {
            System.out.println("Thur");

        } else if (num == 5) {
            System.out.println("Fri");

        } else System.out.println("NA");
    }
}
