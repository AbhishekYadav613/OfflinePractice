package recurrent;

import java.util.Scanner;

// tell the number of days in month on user's choice of month using switch case.
public class NoOfDaysOnInput {
    public static void main(String[] args) {
        NoOfDaysOnInput days = new NoOfDaysOnInput();
        days.cal();

    }

    public void cal()
    {

        System.out.println("Enter the month's name:");
        Scanner pm = new Scanner(System.in);
        String mon = pm.nextLine();

        switch (mon) {
            case ("January"):
                System.out.println("Jan: 31");
                break;

            case ("February"):
                System.out.println("Feb: 29");
            break;

            case ("July"):
                System.out.println("July: 31");
            break;

            case ("Dec"):
                System.out.println("Dec: 31");
            break;

            case ("March"):
                System.out.println("Mar: 30");
            break;

default:
                System.out.println("DATA NOT AVAILABLE.");

        }
    }

}
