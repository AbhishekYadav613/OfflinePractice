package random1;

//Adding the numbers present in a string. (repeat)
public class SumOfNumbersInString3 {
    public static void main(String[] args) {

        String k = "34543@#$re";
        char at[] = k.toCharArray();
        int sum = 0;

        for (int abc : at) {
            if (Character.isDigit(abc))

                sum = sum + Character.getNumericValue(abc);


        }
        System.out.println("Sum is :" + sum);

    }
}