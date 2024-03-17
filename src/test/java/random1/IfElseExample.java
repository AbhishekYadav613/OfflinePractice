package random1;

import java.util.Scanner;

//giving result on the basis of marks scored by the student.
public class IfElseExample {
    public static void main(String[] args) {
        IfElseExample tr = new IfElseExample();
        tr.add();
    }

    public void add() {
        System.out.print("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.print("Enter your roll number: ");
        int roll = scan.nextInt();

        System.out.print("Enter your marks: ");
        float marks = scan.nextFloat();

        if (marks > 0 && marks <= 30) {
            System.out.println("Your name is " +name+ " " + "and your roll number is " +roll+ "."+" "+ "Your result is FAIL");
        } else if (marks > 30 && marks < 75) {
            System.out.println("Your name is " +name+ " " + "and your roll number is " +roll+ "."+" "+ "Your result is PASS WITHOUT DISTINCTION.");

        } else if (marks >= 75 & marks < 90) {
            System.out.println("Your name is " +name+ " " + "and your roll number is " +roll+ "."+" "+ "Your result is FIRST CLASS.");

        } else if (marks >= 90 & marks <= 100) {
            System.out.println("Your name is " +name+ " " + "and your roll number is " +roll+ "."+" "+ "Your result is TOPPER.");

        } else
            System.out.println("PLEASE RE-CHECK THE ENTERED DETAILS.");
    }

}
