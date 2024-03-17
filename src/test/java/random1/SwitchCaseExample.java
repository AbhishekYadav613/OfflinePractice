package random1;

import java.util.Scanner;

//Switch Case example to check the case number on the basis of user's input.
public class SwitchCaseExample {
    public static void main(String[] args) {

        System.out.println("Enter the number between 1 to 5:");
        Scanner sd = new Scanner(System.in);
        int num = sd.nextInt();

        switch (num) {
            case 1:
                System.out.println("This is case 1.");
                break;

            case 2:
                System.out.println("This is case 2.");
                break;

            case 3:
                System.out.println("This is case 3.");
                break;

            case 4:
                System.out.println("This is case 4.");
                break;

            case 5:
                System.out.println("This is case 5.");
                break;
            default:
                System.out.println("NO CASE FOUND.");
        }
    }
}