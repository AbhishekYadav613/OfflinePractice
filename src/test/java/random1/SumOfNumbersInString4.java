package random1;

//Sum of numbers in a string (repeated)
public class SumOfNumbersInString4 {
    public static void main(String[] args) {

        String s = "df54d43$32f34$";
        char ar[] = s.toCharArray();
        int sum = 0;

        for (char rdx : ar) {

            if (Character.isDigit(rdx))
                sum = sum + Character.getNumericValue(rdx);

        }
        System.out.println("Sum is: " + sum);
    }
}