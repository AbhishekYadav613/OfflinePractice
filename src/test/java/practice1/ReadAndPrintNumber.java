package practice1;

import java.util.Scanner;

//Scanner class to take input and print that input.
public class ReadAndPrintNumber {

    public static void main(String[] args) {

        ReadAndPrintNumber cl = new ReadAndPrintNumber();
        cl.enterNumber();
    }
        public void enterNumber()
        {
            int num;

            System.out.println("Enter a number you want to see printed on the screen: ");
            Scanner scan = new Scanner(System.in);

            num = scan.nextInt();

            System.out.println("YOUR LUCKY NUMBER IS: " + num);
        }
    }

