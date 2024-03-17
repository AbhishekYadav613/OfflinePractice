package random1;

//Adding the numbers present in a string.
public class SumOfNumbersInString1 {
    public static void main(String[] args) {

        String k = "Abh763049ish34e3k9";
        int sum = 0;

        char ar[] = k.toCharArray(); // converting string to array first.

        for (char var : ar) {
            if (Character.isDigit(var))  //checking in string if its alphabet or number
                sum = sum + Character.getNumericValue(var);

        }
        System.out.println(sum);

    }

}
