package random1;

//adding numbers in a string using Character, CharArray, for each loop.
public class StringNumberAdd {
    public static void main(String[] args) {

        String str = "We23r6Tyu6";
        int sum = 0;

        char ar[] = str.toCharArray();

        for (char rf : ar)

            if (Character.isDigit(rf)) {
                sum = sum + Character.getNumericValue(rf);

            }
        System.out.println("The Sum of digits in String is: " + sum);
    }

}