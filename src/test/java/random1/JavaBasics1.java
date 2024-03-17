package random1;

public class JavaBasics1 {

    public static void main(String[] args) {
   /* System.out.print("This is a single line statement.");
    System.out.println("This is second statement.");
    System.out.print("Statement in next line.");  */

//Creating Object in class and calling the methods.

        JavaBasics1 cal = new JavaBasics1();
        cal.addNumbers(10, 20);
        cal.subNumbers(30, 15);
        cal.multiplyNumbers(10, 10);
        cal.divideNumbers(30, 10);


    }

    //Creating addition method.
    public void addNumbers(int x, int y) {
        int sum = x + y;
        System.out.println("Sum of the numbers is: " + sum);
    }

//Creating  subtraction method.

    public void subNumbers(int x, int y) {
        int difference = x - y;
        System.out.println("Difference between the numbers is: " + difference);
    }

//Creating multiplication method.

    public void multiplyNumbers(int x, int y) {
        int result = x * y;
        System.out.println("Multiplication of the numbers resulted in " + result);
    }

//Creating division method.

    public void divideNumbers(int x, int y) {
        int z = x / y;
        System.out.println("Result of division is " + z);
    }


}

