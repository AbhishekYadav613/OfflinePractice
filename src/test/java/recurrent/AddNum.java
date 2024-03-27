package recurrent;

import java.util.Scanner;

// taking input from users and adding three numbers.
public class AddNum {
    public static void main(String[] args) {
        AddNum tr = new AddNum();
        tr.add();

    }

    public void add()
    {
        System.out.println("Enter three numbers you want to add:  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum= a+b+c;

        System.out.println("Required sum is: "+sum);

    }
}
