package random1;

import java.util.Scanner;

//taking user's string input and calculating the sum of numbers in that string.
public class SumOfNumInRandomString {
    public static void main(String[] args) {
        SumOfNumInRandomString gh = new SumOfNumInRandomString();
        gh.css();
    }

    public void css() {
        System.out.println("Enter the String containing letters and digits: ");
        Scanner scan = new Scanner(System.in);
        String K = scan.nextLine();
        int sum = 0;

        char[] ar = K.toCharArray();

        for (char ref : ar) {
            if (Character.isDigit(ref))
                sum = sum + Character.getNumericValue(ref);

        }
        System.out.println("The sum of the numbers in the entered string is: " + sum);
    }
}
