package random1;

import net.bytebuddy.description.type.TypeDescription;
//Adding the numbers present in a string. (repeat)
public class SumOfNumbersInString2 {

    public static void main(String[] args) {

        String a="1we32e4r5t";
        int sum=0;

        char at[]= a.toCharArray();

        for (int amp : at)
        {
            if (Character.isDigit(amp))
                sum = sum + Character.getNumericValue(amp);

        }
        System.out.println("The sum of the numbers in the string is: "+sum);
    }

}
