package practice1;

//addition of numbers in a string.
public class AdditionUsingCharArray {
    public static void main(String[] args) {

        String k = "qw23E34R56&yt";
        int sum = 0;
        char[] ch = k.toCharArray();

        for (char ref : ch) {
            if (Character.isDigit(ref)) {

                sum = sum + Character.getNumericValue(ref);
            }
        }
                System.out.println("The sum of numbers in the string is: " + sum);


        }

}
