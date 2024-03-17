package practice1;

// used scanner class and method calling.

import java.util.Scanner;

public class methodcheck {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        methodcheck str = new methodcheck();
        str.check();
        str.status();

    }

    public void check()
    {
        System.out.println("This is method calling check.");
    }


    public void status ()
    {

        System.out.println("Select True or False: ");
        Scanner scan = new Scanner(System.in);
        String k = scan.next();

        if (k.equalsIgnoreCase("true"))
            System.out.println("Status is fine.");

        else
            System.out.println("Please update the status.");

    }
}
