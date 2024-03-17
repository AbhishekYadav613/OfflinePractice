package random1;

import java.util.Scanner;

//simple switch case.
public class SwitchhCasee {
    public static void main(String[] args) {
SwitchhCasee ex = new SwitchhCasee();
ex.chat();

    }

    public void chat() {
        System.out.println("Enter a character from A, B and C: ");
        Scanner scan = new Scanner(System.in);
        String ch = scan.next();

        switch (ch) {
            case "A":
                System.out.println("You entered A.");
                System.out.println("EXIT.");
                break;
            case "B":
                System.out.println("You entered B.");
                System.out.println("EXIT.");
                break;
            case "C":
                System.out.println("You entered C.");
                System.out.println("EXIT.");
                break;
            default:
                System.out.println("Please TRY AGAIN.");
        }
    }
}
